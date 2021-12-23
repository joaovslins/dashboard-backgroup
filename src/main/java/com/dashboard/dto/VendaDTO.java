package com.dashboard.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

import com.dashboard.domain.Vendedor;

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
public class VendaDTO extends AbstractDTO{

	private Double valortotal;
	
	private Date data;
	
	@PrePersist
	private void setDatedata() {
		data = new Date();
	}
	
	@OneToOne
	private VendedorDTO vendedor;
	
	
	

	

	
	
}
