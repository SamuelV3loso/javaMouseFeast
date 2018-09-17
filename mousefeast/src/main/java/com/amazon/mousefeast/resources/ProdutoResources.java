package com.amazon.mousefeast.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	

	@GetMapping
	public List<Produto> ListarPeloId() {
		return produtoRepository.findAll();
	}

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@PutMapping
	public Produto atualizar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@DeleteMapping("{id}")
	public void deletarPeloId(@PathVariable("id") Long id) {
		produtoRepository.deleteById(id);
	}
}
