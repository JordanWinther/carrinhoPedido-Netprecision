package com.netprecision.repository;

import org.springframework.data.repository.CrudRepository;

import com.netprecision.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
