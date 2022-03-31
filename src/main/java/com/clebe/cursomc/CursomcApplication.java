package com.clebe.cursomc;

import com.clebe.cursomc.domain.Categoria;
import com.clebe.cursomc.domain.Cidade;
import com.clebe.cursomc.domain.Estado;
import com.clebe.cursomc.domain.Produto;
import com.clebe.cursomc.repositories.CategoriaRepository;
import com.clebe.cursomc.repositories.CidadeRepository;
import com.clebe.cursomc.repositories.EstadoRepository;
import com.clebe.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository ;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		// Parei na aula 17
		SpringApplication.run(CursomcApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		Categoria cat1 = new Categoria(1, "Informática");
//		Categoria cat2 = new Categoria(2, "Escritório");
//
//		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
//
//		Produto prod1 = new Produto(null, "Computador", 2000.00);
//		Produto prod2 = new Produto(null, "Impressora", 800.00);
//		Produto prod3 = new Produto(null, "Mouse", 80);
//
//		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
//
//		cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
//		cat2.getProdutos().addAll(Arrays.asList(prod2));
//
//		prod1.getCategorias().addAll(Arrays.asList(cat1));
//		prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
//		prod3.getCategorias().addAll(Arrays.asList(cat1));
//
//		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
//		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");


		Cidade cid1 = new Cidade(null, "Urbelandia", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		Cidade cid3 = new Cidade(null, "Campinas", est2);

		est1.setCidades(Collections.singletonList(cid1));
		est2.setCidades(Arrays.asList(cid2, cid3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
	}
}
