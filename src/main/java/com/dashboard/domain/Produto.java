package com.dashboard.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Produto extends AbstractEntity{
	
	private String nome;
	
	private Double preco;
	
	private Date datacadastro;
	
	@PrePersist
	private void setDatedatacadastro() {
		datacadastro = new Date();
	}
	
	
	

}
