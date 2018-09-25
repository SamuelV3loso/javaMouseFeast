package com.amazon.mousefeast.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.mousefeast.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findByNomeContainingIgnoreCase(String nome);
	
}
