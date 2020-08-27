package br.com.itau.desafio2;

import br.com.itau.desafio2.controller.CategoriaController;
import br.com.itau.desafio2.controller.LancamentoController;
import br.com.itau.desafio2.model.Categoria;
import br.com.itau.desafio2.model.Lancamento;
import br.com.itau.desafio2.service.CategoriaService;
import br.com.itau.desafio2.service.LancamentoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class Desafio2ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockBean
	private LancamentoService lancamentoService;

	@MockBean
	private CategoriaService categoriaService;

	@Test
	void case1() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "1";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 1);
		Assertions.assertEquals(lancamento.get(0).getValor(), 13.3);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(0).getMes(), 1);
	}

	@Test
	void case2() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "2";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 2);
		Assertions.assertEquals(lancamento.get(0).getValor(), 130.5);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "PS Store");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 2);
		Assertions.assertEquals(lancamento.get(0).getMes(), 2);
	}

	@Test
	void case3() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "3";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 3);
		Assertions.assertEquals(lancamento.get(0).getValor(), 1023.66);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Carrefour");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 6);
		Assertions.assertEquals(lancamento.get(0).getMes(), 5);
	}

	@Test
	void case4() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "4";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 4);
		Assertions.assertEquals(lancamento.get(0).getValor(), 132.44);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Mercado Três Irmãos");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 6);
		Assertions.assertEquals(lancamento.get(0).getMes(), 6);
	}

	@Test
	void case5() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "11";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 11);
		Assertions.assertEquals(lancamento.get(0).getValor(), 33.52);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Pet Shop Lowcão");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 3);
		Assertions.assertEquals(lancamento.get(0).getMes(), 3);
	}

	@Test
	void case6() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "22";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 22);
		Assertions.assertEquals(lancamento.get(0).getValor(), 13.3);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Drogasil");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 3);
		Assertions.assertEquals(lancamento.get(0).getMes(), 5);
	}

	@Test
	void case7() throws Exception {
		//Lancamentos por ID
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "33";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorId(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 33);
		Assertions.assertEquals(lancamento.get(0).getValor(), 12.3);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(0).getMes(), 3);
	}

	@Test
	void case8() throws Exception {
		//Lancamentos por ID da Categoria
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "1";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorCategoria(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 1);
		Assertions.assertEquals(lancamento.get(0).getValor(), 13.3);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(0).getMes(), 1);

		Assertions.assertEquals(lancamento.get(1).getId(), 6);
		Assertions.assertEquals(lancamento.get(1).getValor(), 12.5);
		Assertions.assertEquals(lancamento.get(1).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(1).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(1).getMes(), 3);

		Assertions.assertEquals(lancamento.get(2).getId(), 13);
		Assertions.assertEquals(lancamento.get(2).getValor(), 7.9);
		Assertions.assertEquals(lancamento.get(2).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(2).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(2).getMes(), 7);

		Assertions.assertEquals(lancamento.get(3).getId(), 14);
		Assertions.assertEquals(lancamento.get(3).getValor(), 12.3);
		Assertions.assertEquals(lancamento.get(3).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(3).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(3).getMes(), 3);

		Assertions.assertEquals(lancamento.get(4).getId(), 26);
		Assertions.assertEquals(lancamento.get(4).getValor(), 7.9);
		Assertions.assertEquals(lancamento.get(4).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(4).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(4).getMes(), 7);

		Assertions.assertEquals(lancamento.get(5).getId(), 32);
		Assertions.assertEquals(lancamento.get(5).getValor(), 7.9);
		Assertions.assertEquals(lancamento.get(5).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(5).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(5).getMes(), 7);

		Assertions.assertEquals(lancamento.get(6).getId(), 33);
		Assertions.assertEquals(lancamento.get(6).getValor(), 12.3);
		Assertions.assertEquals(lancamento.get(6).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(6).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(6).getMes(), 3);
	}

	@Test
	void case9() throws Exception {
		//Lancamentos por ID da Categoria
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "4";
		List<Lancamento> lancamento = new LancamentoService().lancamentosPorCategoria(id);

		Assertions.assertEquals(lancamento.get(0).getId(), 9);
		Assertions.assertEquals(lancamento.get(0).getValor(), 234.45);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(0).getMes(), 1);

		Assertions.assertEquals(lancamento.get(1).getId(), 17);
		Assertions.assertEquals(lancamento.get(1).getValor(), 199.3);
		Assertions.assertEquals(lancamento.get(1).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(1).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(1).getMes(), 3);

		Assertions.assertEquals(lancamento.get(2).getId(), 28);
		Assertions.assertEquals(lancamento.get(2).getValor(), 4.45);
		Assertions.assertEquals(lancamento.get(2).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(2).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(2).getMes(), 1);

		Assertions.assertEquals(lancamento.get(3).getId(), 36);
		Assertions.assertEquals(lancamento.get(3).getValor(), 199.3);
		Assertions.assertEquals(lancamento.get(3).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(3).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(3).getMes(), 3);
	}

	@Test
	void case10() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "1";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 1);
		Assertions.assertEquals(categoria.get(0).getNome(), "Transporte");
	}

	@Test
	void case11() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "2";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 2);
		Assertions.assertEquals(categoria.get(0).getNome(), "Compras Online");
	}

	@Test
	void case12() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "3";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 3);
		Assertions.assertEquals(categoria.get(0).getNome(), "Saúde e Beleza");
	}

	@Test
	void case13() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "4";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 4);
		Assertions.assertEquals(categoria.get(0).getNome(), "Serviços Automotivos");
	}

	@Test
	void case14() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "5";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 5);
		Assertions.assertEquals(categoria.get(0).getNome(), "Restaurantes");
	}

	@Test
	void case15() throws Exception {
		//Categorias por ID
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		String id = "6";
		List<Categoria> categoria = new CategoriaService().categoriasPorId(id);

		Assertions.assertEquals(categoria.get(0).getId(), 6);
		Assertions.assertEquals(categoria.get(0).getNome(), "Super Mercados");
	}

	@Test
	void case16() throws Exception {
		//Lista de Lancamentos
		LancamentoController lancamentoController = new LancamentoController();
		mockMvc.perform(MockMvcRequestBuilders.get("/lancamentos")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(lancamentoController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		List<Lancamento> lancamento = new LancamentoService().listaLancamentos();

		Assertions.assertEquals(lancamento.get(0).getId(), 1);
		Assertions.assertEquals(lancamento.get(0).getValor(), 13.3);
		Assertions.assertEquals(lancamento.get(0).getOrigem(), "Uber");
		Assertions.assertEquals(lancamento.get(0).getCategoria(), 1);
		Assertions.assertEquals(lancamento.get(0).getMes(), 1);

		Assertions.assertEquals(lancamento.get(1).getId(), 9);
		Assertions.assertEquals(lancamento.get(1).getValor(), 234.45);
		Assertions.assertEquals(lancamento.get(1).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(1).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(1).getMes(), 1);

		Assertions.assertEquals(lancamento.get(2).getId(), 19);
		Assertions.assertEquals(lancamento.get(2).getValor(), 56.3);
		Assertions.assertEquals(lancamento.get(2).getOrigem(), "Pet Shop Lowcão");
		Assertions.assertEquals(lancamento.get(2).getCategoria(), 3);
		Assertions.assertEquals(lancamento.get(2).getMes(), 1);

		Assertions.assertEquals(lancamento.get(3).getId(), 21);
		Assertions.assertEquals(lancamento.get(3).getValor(), 22.3);
		Assertions.assertEquals(lancamento.get(3).getOrigem(), "Mercado Três Irmãos");
		Assertions.assertEquals(lancamento.get(3).getCategoria(), 6);
		Assertions.assertEquals(lancamento.get(3).getMes(), 1);

		Assertions.assertEquals(lancamento.get(4).getId(), 28);
		Assertions.assertEquals(lancamento.get(4).getValor(), 4.45);
		Assertions.assertEquals(lancamento.get(4).getOrigem(), "Oficina Bom Sucesso");
		Assertions.assertEquals(lancamento.get(4).getCategoria(), 4);
		Assertions.assertEquals(lancamento.get(4).getMes(), 1);

		Assertions.assertEquals(lancamento.get(5).getId(), 38);
		Assertions.assertEquals(lancamento.get(5).getValor(), 56.3);
		Assertions.assertEquals(lancamento.get(5).getOrigem(), "Pet Shop Lowcão");
		Assertions.assertEquals(lancamento.get(5).getCategoria(), 3);
		Assertions.assertEquals(lancamento.get(5).getMes(), 1);

		Assertions.assertEquals(lancamento.get(6).getId(), 40);
		Assertions.assertEquals(lancamento.get(6).getValor(), 22.3);
		Assertions.assertEquals(lancamento.get(6).getOrigem(), "Mercado Três Irmãos");
		Assertions.assertEquals(lancamento.get(6).getCategoria(), 6);
		Assertions.assertEquals(lancamento.get(6).getMes(), 1);
	}

	@Test
	void case17() throws Exception {
		///Lista de Categorias
		CategoriaController categoriaController = new CategoriaController();
		mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(categoriaController)))
				.andExpect(MockMvcResultMatchers.status().isOk());

		List<Categoria> categoria = new CategoriaService().listaCategorias();

		Assertions.assertEquals(categoria.get(0).getId(), 1);
		Assertions.assertEquals(categoria.get(0).getNome(), "Transporte");

		Assertions.assertEquals(categoria.get(1).getId(), 2);
		Assertions.assertEquals(categoria.get(1).getNome(), "Compras Online");

		Assertions.assertEquals(categoria.get(2).getId(), 3);
		Assertions.assertEquals(categoria.get(2).getNome(), "Saúde e Beleza");

		Assertions.assertEquals(categoria.get(3).getId(), 4);
		Assertions.assertEquals(categoria.get(3).getNome(), "Serviços Automotivos");

		Assertions.assertEquals(categoria.get(4).getId(), 5);
		Assertions.assertEquals(categoria.get(4).getNome(), "Restaurantes");

		Assertions.assertEquals(categoria.get(5).getId(), 6);
		Assertions.assertEquals(categoria.get(5).getNome(), "Super Mercados");
	}
}
