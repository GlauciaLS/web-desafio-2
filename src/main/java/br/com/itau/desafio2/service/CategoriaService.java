package br.com.itau.desafio2.service;

import br.com.itau.desafio2.model.Categoria;

import br.com.itau.desafio2.model.Lancamento;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@EnableWebMvc
public class CategoriaService {
    private RestTemplate restTemplate = new RestTemplate();
    private Gson gson = new Gson();

    private HttpHeaders headers = new HttpHeaders();
    private HttpEntity<String> entity = new HttpEntity<String>(headers);

    private String url = "https://desafio-it-server.herokuapp.com/categorias";

    public List<Categoria> listaCategorias() {
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String bodyResponse = restTemplate.exchange(this.url, HttpMethod.GET, entity, String.class).getBody();
        Type lista = new TypeToken<List<Categoria>>(){}.getType();
        List<Categoria> listaDeCategorias = gson.fromJson(bodyResponse, lista);
        return listaDeCategorias.stream()
                .collect(Collectors.toList());
    }

    public List<Categoria> categoriasPorId(String id) {
        int categoriaId = Integer.parseInt(id);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        Type lista = new TypeToken<List<Categoria>>(){}.getType();
        String response = restTemplate.exchange(this.url, HttpMethod.GET, entity, String.class).getBody();
        List<Categoria> listaCategorias = gson.fromJson(response, lista);
        return listaCategorias.stream()
                .filter((categoria) -> categoria.getId() == categoriaId)
                .collect(Collectors.toList());
    }
}
