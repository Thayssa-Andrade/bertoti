package com.bertoti.aeroporto.controllers;

import com.bertoti.aeroporto.entities.Voo;
import com.bertoti.aeroporto.services.VooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/voos") // A URL base será localhost:8080/voos
public class VooController {

    @Autowired
    private VooService vooService;

    // 1. GET: localhost:8080/voos
    @GetMapping
    public List<Voo> listarTodos() {
        return vooService.listarTodos();
    }

    // 2. GET: localhost:8080/voos/1
    @GetMapping("/{id}")
    public ResponseEntity<Voo> buscarPorId(@PathVariable Long id) {
        return vooService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. POST: localhost:8080/voos
    @PostMapping
    public Voo criarVoo(@RequestBody Voo voo) {
        return vooService.salvar(voo);
    }

    // 4. PUT: localhost:8080/voos/1
    @PutMapping("/{id}")
    public ResponseEntity<Voo> atualizarVoo(@PathVariable Long id, @RequestBody Voo voo) {
        try {
            return ResponseEntity.ok(vooService.atualizar(id, voo));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // 5. DELETE: localhost:8080/voos/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVoo(@PathVariable Long id) {
        vooService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
