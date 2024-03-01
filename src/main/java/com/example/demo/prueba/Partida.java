package com.example.demo.prueba;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Partida {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String deporte;
    private String ciudad;
    private String provincia;
    private LocalDateTime fecha;
    private LocalDateTime hora_comienzo;
    private LocalDateTime hora_final;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "partida_usuario",
        joinColumns = @JoinColumn(name = "partida_id"),
        inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )

     private List<Usuario> usuarios;

}



