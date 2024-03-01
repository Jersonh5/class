package com.example.demo.prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prueba.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
