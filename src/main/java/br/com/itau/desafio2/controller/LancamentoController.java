package br.com.itau.desafio2.controller;

import br.com.itau.desafio2.model.Lancamento;
import br.com.itau.desafio2.service.LancamentoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoController {
    private final LancamentoService lancamentoService = new LancamentoService();

    @GetMapping("")
    public @ResponseBody List<Lancamento> listaLancamentos() {
        return lancamentoService.listaLancamentos();
    }

    @GetMapping("/{id}")
    public @ResponseBody List<Lancamento> lancamentosPorId(@PathVariable String id) {
        return lancamentoService.lancamentosPorId(id);
    }

    @GetMapping("/categoria/{id}")
    public @ResponseBody List<Lancamento> lancamentosPorCategoria(@PathVariable String id) {
        return lancamentoService.lancamentosPorCategoria(id);
    }
}
