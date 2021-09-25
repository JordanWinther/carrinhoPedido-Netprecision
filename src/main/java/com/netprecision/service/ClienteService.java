package com.netprecision.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.netprecision.model.Cliente;
import com.netprecision.repository.ClienteRepository;

@Service
	public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Iterable<Cliente> listarClientes(){
		return  clienteRepository.findAll();
	}

	
	public Cliente salvar(Cliente cliente) {
		return	clienteRepository.save(cliente);
	}
	
	
	
}
