package com.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.domain.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
