package com.dashboard.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.dashboard.domain.Venda;
import com.dashboard.repository.VendaRepository;

@Service
public class VendaService extends AbstractService<Venda, JpaRepository<Venda,Long>> {

	
	public VendaService(@Autowired VendaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
