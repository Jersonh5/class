package com.example.demo.prueba.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.prueba.Mensaje;
import com.example.demo.prueba.repositorios.MensajeRepository;

import java.util.List;

@RestController
@RequestMapping("/mensajes")
public class MensajesController {

    @Autowired
    private MensajeRepository mensajeRepository;

    @GetMapping
    public List<Mensaje> getAllMensajes() {
        return mensajeRepository.findAll();
    }

    @PostMapping
    public Mensaje createMensaje(@RequestBody Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @GetMapping("/{id}")
    public Mensaje getMensajeById(@PathVariable Long id) {
        return mensajeRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteMensaje(@PathVariable Long id) {
        mensajeRepository.deleteById(id);
    }
}