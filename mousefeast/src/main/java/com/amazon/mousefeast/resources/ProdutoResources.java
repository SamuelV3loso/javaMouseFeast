package com.amazon.mousefeast.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.mousefeast.models.Produto;
import com.amazon.mousefeast.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/mousefeast")
public class ProdutoResources {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		 return produtoRepository.findAll();
	}
}
