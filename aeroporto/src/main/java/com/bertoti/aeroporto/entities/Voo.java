package com.bertoti.aeroporto.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "VOO")
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voo_seq")
    @SequenceGenerator(name = "voo_seq", sequenceName = "SEQ_VOO", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORIGEM", nullable = false, length = 100)
    private String origem;

    @Column(name = "DESTINO", nullable = false, length = 100)
    private String destino;

    @Column(name = "DATA_VOO", nullable = false)
    private LocalDateTime dataVoo;

    public Voo() {
    }

    public Voo(String origem, String destino, LocalDateTime dataVoo) {
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
    }

    public Long getId() {
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }
}
