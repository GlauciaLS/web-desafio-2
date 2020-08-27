package br.com.itau.desafio2.controller;

import br.com.itau.desafio2.model.Categoria;
import br.com.itau.desafio2.service.CategoriaService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/categorias")

public class CategoriaController {
    private final CategoriaService categoriaService = new CategoriaService();

    @GetMapping("")
    public @ResponseBody List<Categoria> listaCategorias() {
        return categoriaService.listaCategorias();
    }

    @GetMapping("/{id}")
    public @ResponseBody List<Categoria> categoriasPorId(@PathVariable String id) {
        return categoriaService.categoriasPorId(id);
    }
}
