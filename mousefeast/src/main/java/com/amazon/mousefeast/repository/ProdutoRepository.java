package com.amazon.mousefeast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.mousefeast.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
