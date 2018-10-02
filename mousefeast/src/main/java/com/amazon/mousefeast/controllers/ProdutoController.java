package com.amazon.mousefeast.controllers;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.amazon.mousefeast.models.Produto;
import com.amazon.mousefeast.repository.ProdutoRepository;

@Controller
@RequestMapping( "/produtocontroller" )
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping( "/new" )
	public String newProduto(ModelMap model ) {
		Produto produto = new Produto();
		model.addAttribute("produto", produto);
		model.addAttribute("edit", false);
		return "produto/form";
	}
	
	@RequestMapping( "/list" )
	public String listProduto(ModelMap model ) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtoList", produtos);
		return "produto/list";
	}
	
	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public String saveProduto(@Valid Produto produto, BindingResult result,
							ModelMap model,
							RedirectAttributes attributes) {
		
		System.out.println(produto);
		
		if (result.hasErrors()) {
			return "produto/form";
		}
		
		produtoRepository.saveAndFlush(produto);
		
		model.addAttribute("mensagem", "Produto " + produto.getNome() + " registrado com sucesso");
		
		attributes.addFlashAttribute("msg", "flash attributes");
		
		
		return "redirect:/produtocontroller/list";
	}
	
	@GetMapping(value = { "/edit" })
	public String editProduto(@PathVariable("id") Integer id, ModelMap model) {
		Produto produto = produtoRepository.getOne(id);
		model.addAttribute("produto", produto);
		model.addAttribute("edit", true);
		
		return "produto/form";
	}
	
	@PostMapping(value = { "/edit-{id}-aluno" })
	public String updateAluno(@Valid Produto produto, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "produto/form";
		}
		
		produtoRepository.saveAndFlush(produto);
		
		model.addAttribute("mensagem", "Aluno " + produto.getNome() + " atualizado com sucesso");
		
		return "redirect:/produto/list";
	}
	
	@GetMapping(value = { "/delete" })
	public String deleteAluno(@RequestParam("produtoId") Integer id) {
		produtoRepository.deleteById(id);
		return "redirect:/produtocontroller/list";
	}
	
	
	
}
