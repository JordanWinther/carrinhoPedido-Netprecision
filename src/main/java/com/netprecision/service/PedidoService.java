package com.netprecision.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netprecision.model.Cliente;
import com.netprecision.model.Pedido;
import com.netprecision.repository.ClienteRepository;
import com.netprecision.repository.PedidoRepository;

	@Service
	public class PedidoService {

		@Autowired
		private PedidoRepository pedidoRepository;
		
		
		public List<Pedido> listarPedidos(){
			return  (List<Pedido>) pedidoRepository.findAll();
		}

		
		public Pedido salvar(Pedido pedido) {
			
			if (pedido.getId() == null || pedido.getId().isEmpty()) {
				
					pedido.setId(UUID.randomUUID().toString());
				}
			
			return	pedidoRepository.save(pedido);
		}
}
