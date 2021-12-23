package com.dashboard.converter;

import static java.util.Optional.ofNullable;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.dashboard.domain.Venda;
import com.dashboard.domain.Vendedor;
import com.dashboard.dto.VendaDTO;
import com.dashboard.dto.VendedorDTO;


@Component
public class VendaConverter implements Converter<Venda, VendaDTO> {
	
	@Autowired
	private VendedorConverter vendedor;
	
	
	//usar para consultas
	@Override
	public VendaDTO from(Venda entity) {
		VendaDTO dto = new VendaDTO();
		
		ofNullable(entity.getId()).ifPresent(dto::setId);
		ofNullable(entity.getValortotal()).ifPresent(dto::setValortotal);
		ofNullable(entity.getData()).ifPresent(dto::setData);
		
		if(ofNullable(entity.getVendedor()).isPresent()){			
			dto.setVendedor(vendedor.from(entity.getVendedor()));
		};
		
		return dto;
	}

	//usar para novos cadastros
	@Override
	public Venda to(VendaDTO dto) {
		Venda entity = new Venda();
		
		ofNullable(dto.getId()).ifPresent(entity::setId);
		ofNullable(dto.getValortotal()).ifPresent(entity::setValortotal);
		ofNullable(dto.getData()).ifPresent(entity::setData);

		if(ofNullable(dto.getVendedor()).isPresent()) {
			entity.setVendedor(vendedor.to(dto.getVendedor()));
		}
		return entity;
	}

	//usar para atualização | put
	@Override 
	public Venda to(VendaDTO dto, Venda entity) {
		
		ofNullable(dto.getId()).ifPresent(entity::setId);
		ofNullable(dto.getValortotal()).ifPresent(entity::setValortotal);
		ofNullable(dto.getData()).ifPresent(entity::setData);
		
		if(ofNullable(dto.getVendedor()).isPresent()) {
			entity.setVendedor(vendedor.to(dto.getVendedor(), entity.getVendedor()));
		}
		return entity;
	}

}
