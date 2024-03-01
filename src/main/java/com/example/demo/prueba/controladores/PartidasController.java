package com.example.demo.prueba.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.prueba.Partida;
import com.example.demo.prueba.repositorios.PartidaRepository;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidasController {

    @Autowired
    private PartidaRepository partidaRepository;

    @GetMapping
    public List<Partida> getAllPartidas() {
        return partidaRepository.findAll();
    }

    @PostMapping
    public Partida createPartida(@RequestBody Partida partida) {
        return partidaRepository.save(partida);
    }

    @GetMapping("/{id}")
    public Partida getPartidaById(@PathVariable Long id) {
        return partidaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletePartida(@PathVariable Long id) {
        partidaRepository.deleteById(id);
    }
}
