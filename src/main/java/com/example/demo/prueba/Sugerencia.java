package com.example.demo.prueba;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sugerencia {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String descripcion;
    private LocalDateTime create_at;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}