package com.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
