package com.example.demo.prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prueba.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    
}
