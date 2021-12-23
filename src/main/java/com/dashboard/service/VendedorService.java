package com.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.dashboard.domain.Vendedor;
import com.dashboard.repository.VendedorRepository;

@Service
public class VendedorService extends AbstractService<Vendedor, JpaRepository<Vendedor,Long>>{

	
	
	
	public VendedorService(@Autowired VendedorRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
