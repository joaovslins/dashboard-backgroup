package com.dashboard.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dashboard.domain.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
	
	

}
