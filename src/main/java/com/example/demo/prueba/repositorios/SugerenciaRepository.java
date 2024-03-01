package com.example.demo.prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prueba.Sugerencia;

public interface SugerenciaRepository extends JpaRepository<Sugerencia, Long>{
    
}
