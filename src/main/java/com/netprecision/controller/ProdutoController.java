package com.netprecision.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netprecision.model.Cliente;
import com.netprecision.model.Pedido;
import com.netprecision.model.Produto;
import com.netprecision.service.ClienteService;
import com.netprecision.service.PedidoService;
import com.netprecision.service.ProdutoService;


	@RestController
	@RequestMapping("/produtos")
	public class ProdutoController {
	
	
	@Autowired
	private ProdutoService produtoService;
	
	
	
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Produto>>  listarProdutos (){

		return ResponseEntity.ok(produtoService.listarProdutos());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Produto> salvarProdutos (@Valid @RequestBody  Produto produto) {
		return ResponseEntity.ok(produtoService.salvar(produto));
	}
}
