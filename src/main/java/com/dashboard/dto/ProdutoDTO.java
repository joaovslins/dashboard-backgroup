package com.dashboard.dto;

import java.util.Date;

import javax.persistence.Inheritance;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Inheritance
@Data
public class ProdutoDTO extends AbstractDTO{
	
	private String nome;
	
	private double preco;
	
	private Date datacadastro;
	
	@PrePersist
	private void setDatedatacadastro() {
		datacadastro = new Date();
	}

}
