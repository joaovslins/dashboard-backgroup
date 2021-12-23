package com.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.dashboard.domain.Produto;
import com.dashboard.repository.ProdutoRepository;

@Service
public class ProdutoService extends AbstractService<Produto, JpaRepository<Produto,Long>> {

	public ProdutoService(@Autowired ProdutoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
