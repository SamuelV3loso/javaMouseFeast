package com.amazon.mousefeast.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.mousefeast.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	List<Produto> findByNomeContainingIgnoreCase(String nome);
	
}
