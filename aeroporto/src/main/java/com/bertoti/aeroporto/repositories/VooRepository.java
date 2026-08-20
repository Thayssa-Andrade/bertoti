package com.bertoti.aeroporto.repositories;

import com.bertoti.aeroporto.entities.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {
    // Só de estender o JpaRepository, você já ganha métodos como save(), findAll(), findById(), deleteById()
}