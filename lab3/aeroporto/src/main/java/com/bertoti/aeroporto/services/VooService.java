package com.bertoti.aeroporto.services;

import com.bertoti.aeroporto.entities.Voo;
import com.bertoti.aeroporto.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VooService {

    @Autowired
    private VooRepository vooRepository;

    // 1. Listar todos os voos
    public List<Voo> listarTodos() {
        return vooRepository.findAll();
    }

    // 2. Buscar 1 voo a partir do ID
    public Optional<Voo> buscarPorId(Long id) {
        return vooRepository.findById(id);
    }

    // 3. Criar o voo
    public Voo salvar(Voo voo) {
        return vooRepository.save(voo);
    }

    // 4. Deletar o voo
    public void deletar(Long id) {
        vooRepository.deleteById(id);
    }

    // 5. Atualizar o voo
    public Voo atualizar(Long id, Voo vooAtualizado) {
        return vooRepository.findById(id).map(voo -> {
            voo.setOrigem(vooAtualizado.getOrigem());
            voo.setDestino(vooAtualizado.getDestino());
            voo.setDataVoo(vooAtualizado.getDataVoo());
            return vooRepository.save(voo);
        }).orElseThrow(() -> new RuntimeException("Voo não encontrado!"));
    }
}
