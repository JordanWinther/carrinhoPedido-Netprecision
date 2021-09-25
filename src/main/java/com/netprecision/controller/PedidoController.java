package com.netprecision.controller;

import java.util.List;

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
import com.netprecision.service.PedidoService;

	@RestController
	@RequestMapping("/pedido")
	public class PedidoController {
	

	@Autowired
	private PedidoService pedidoService;
	
	
	
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pedido>>  listarProdutos (){

		return ResponseEntity.ok(pedidoService.listarPedidos());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Pedido> salvarProdutos (@Valid @RequestBody  Pedido pedido) {
		return ResponseEntity.ok(pedidoService.salvar(pedido));
	}
	
	
}
