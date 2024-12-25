package br.com.alura.forum.controller;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> listarTodos() {
        return topicoService.listarTodos();
    }

    @PostMapping
    public Topico criarTopico(@RequestBody Topico topico) {
        return topicoService.criarTopico(topico);
    }

    @GetMapping("/{id}")
    public Topico buscarPorId(@PathVariable Long id) {
        return topicoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarTopico(@PathVariable Long id) {
        topicoService.deletarTopico(id);
    }
}
