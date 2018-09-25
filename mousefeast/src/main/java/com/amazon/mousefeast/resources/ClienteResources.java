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

import com.amazon.mousefeast.models.Cliente;
import com.amazon.mousefeast.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteResources {
	
	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping( "/get" )
	public List<Cliente> listaClientes(){
		 return clienteRepository.findAll();
	}

	@PostMapping( "/save" )
	public Cliente salvar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@PutMapping( "/update" )
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@DeleteMapping("{id}")
	public void deletarPeloId(@PathVariable("id") Integer id) {
		clienteRepository.deleteById(id);
	}
	
	@GetMapping("/search")
	public List<Cliente> pesquisar(@RequestParam("nome") String nome){
		
		List <Cliente> cliente = clienteRepository.findByNomeContainingIgnoreCase(nome);
		return cliente;  
			
	}
	
	
}
