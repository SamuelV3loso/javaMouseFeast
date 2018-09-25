package com.amazon.mousefeast.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazon.mousefeast.models.Produto;
import com.amazon.mousefeast.repository.ProdutoRepository;

@Controller
@RequestMapping( "/produtocontroller" )
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@RequestMapping( "/list" )
	public String listProduto(ModelMap model ) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtoList", produtos);
		return "produto/list";
	}
	
}
