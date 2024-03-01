package com.example.demo.prueba.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.prueba.Sugerencia;
import com.example.demo.prueba.repositorios.SugerenciaRepository;

import java.util.List;

@RestController
@RequestMapping("/sugerencias")
public class SugerenciasController {

    @Autowired
    private SugerenciaRepository sugerenciaRepository;

    @GetMapping
    public List<Sugerencia> getAllSugerencias() {
        return sugerenciaRepository.findAll();
    }

    @PostMapping
    public Sugerencia createSugerencia(@RequestBody Sugerencia sugerencia) {
        return sugerenciaRepository.save(sugerencia);
    }

    @GetMapping("/{id}")
    public Sugerencia getSugerenciaById(@PathVariable Long id) {
        return sugerenciaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteSugerencia(@PathVariable Long id) {
        sugerenciaRepository.deleteById(id);
    }
}
