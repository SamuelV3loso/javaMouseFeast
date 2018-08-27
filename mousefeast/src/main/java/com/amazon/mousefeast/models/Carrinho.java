package com.amazon.mousefeast.models;

import java.util.*;

import javax.persistence.Entity;

@Entity
public class Carrinho {

	private List<Produto> produtos = new ArrayList<Produto>();
	private int quantidade;
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
