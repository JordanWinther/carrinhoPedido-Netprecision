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
import com.netprecision.service.ClienteService;


	@RestController
	@RequestMapping("/clientes")
	public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;
	
	
	
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Cliente>>  listarClientes (){

		return ResponseEntity.ok(clienteService.listarClientes());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Cliente> salvarClientes (@Valid @RequestBody  Cliente cliente) {
		return ResponseEntity.ok(clienteService.salvar(cliente));
	}
}
