package com.netprecision.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.netprecision.model.Cliente;
import com.netprecision.model.Pedido;
import com.netprecision.model.Produto;
import com.netprecision.repository.ClienteRepository;
import com.netprecision.repository.ProdutoRepository;

@Service
	public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public Iterable<Produto> listarProdutos(){
		return  produtoRepository.findAll();
	}

	
	public Produto salvar(@Valid  Produto produto) {
		return	produtoRepository.save(produto);
	}


	
	
	
	
}
