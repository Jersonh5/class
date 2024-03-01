package com.example.demo.prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prueba.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
    
}
