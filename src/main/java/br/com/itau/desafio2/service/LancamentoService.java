package br.com.itau.desafio2.service;

import br.com.itau.desafio2.model.Lancamento;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LancamentoService {
    private RestTemplate restTemplate = new RestTemplate();
    private Gson gson = new Gson();

    private HttpHeaders headers = new HttpHeaders();
    private HttpEntity<String> entity = new HttpEntity<String>(headers);

    private String URL = "https://desafio-it-server.herokuapp.com/lancamentos";

    public List<Lancamento> listaLancamentos() {
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String bodyResponse = restTemplate.exchange(this.URL, HttpMethod.GET, entity, String.class).getBody();
        Type lista = new TypeToken<List<Lancamento>>(){}.getType();
        List<Lancamento> listaDeLancamentos = gson.fromJson(bodyResponse, lista);
        return listaDeLancamentos.stream()
                .sorted(Comparator.comparing(Lancamento::getMes))
                .collect(Collectors.toList());
    }
    public List<Lancamento> lancamentosPorId(String id){
        int lancamentoId = Integer.parseInt(id);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String bodyResponse = restTemplate.exchange(this.URL, HttpMethod.GET, entity, String.class).getBody();
        Type lista = new TypeToken<List<Lancamento>>(){}.getType();
        List<Lancamento> listaDeLancamentos = gson.fromJson(bodyResponse, lista);
        return listaDeLancamentos.stream()
                .sorted(Comparator.comparing(Lancamento::getMes))
                .filter(lancamento -> lancamento.getId() == lancamentoId)
                .collect(Collectors.toList());
    }

    public List<Lancamento> lancamentosPorCategoria(String id){
        int categoriaId = Integer.parseInt(id);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String bodyResponse = restTemplate.exchange(this.URL, HttpMethod.GET, entity, String.class).getBody();
        Type lista = new TypeToken<List<Lancamento>>(){}.getType();
        List<Lancamento> listaDeLancamentos = gson.fromJson(bodyResponse, lista);
        return listaDeLancamentos.stream()
                .sorted(Comparator.comparing(Lancamento::getMes))
                .filter(lancamento -> lancamento.getCategoria() == categoriaId)
                .collect(Collectors.toList());
    }
}
