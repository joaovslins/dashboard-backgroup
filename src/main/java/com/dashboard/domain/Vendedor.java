package com.dashboard.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Vendedor extends AbstractEntity{

	private String nome;
	
	@OneToMany(mappedBy = "vendedor")
	private List<Venda> vendas;
	
}
