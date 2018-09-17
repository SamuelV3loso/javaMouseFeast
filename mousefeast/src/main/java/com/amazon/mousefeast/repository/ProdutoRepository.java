package com.amazon.mousefeast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.mousefeast.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
