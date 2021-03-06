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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.mousefeast.models.Produto;
import com.amazon.mousefeast.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/produto")
public class ProdutoResources {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping( "/get" )
	public List<Produto> listaProdutos(){
		 return produtoRepository.findAll();
	}

	@PostMapping( "/save" )
	public Produto salvar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@PutMapping( "/update" )
	public Produto atualizar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@DeleteMapping("{id}")
	public void deletarPeloId(@PathVariable("id") Integer id) {
		produtoRepository.deleteById(id);
	}
	
	@GetMapping("/search")
	public List<Produto> pesquisar(@RequestParam("nome") String nome){
		
		List <Produto> produto = produtoRepository.findByNomeContainingIgnoreCase(nome);
		return produto;  
			
	}
	
}
