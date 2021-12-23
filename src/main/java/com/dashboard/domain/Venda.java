package com.dashboard.domain;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

	

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Venda extends AbstractEntity{
	
	private Double valortotal;
	
	private Date data;
	
	@PrePersist
	private void setDatedata() {
		data = new Date();
	}
	
	@OneToOne
	private Vendedor vendedor;
	
	
	
	

}
