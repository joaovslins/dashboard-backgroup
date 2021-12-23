package com.dashboard.dto;

import java.util.List;

import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

import com.dashboard.domain.Venda;

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
public class VendedorDTO extends AbstractDTO {

	private String nome;
	
	@OneToMany(mappedBy = "vendedor")
	private List<VendaDTO> vendas;
	
}
