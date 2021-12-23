package com.dashboard.converter;

import static java.util.Optional.ofNullable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dashboard.domain.Vendedor;
import com.dashboard.dto.VendaDTO;
import com.dashboard.dto.VendedorDTO;

@Component
public class VendedorConverter implements Converter<Vendedor, VendedorDTO>{
	
	@Autowired
	private VendaConverter venda;
	
	
	//usar para consultas
		@Override
		public VendedorDTO from(Vendedor entity) {
			VendedorDTO dto = new VendedorDTO();
			
			ofNullable(entity.getId()).ifPresent(dto::setId);
			ofNullable(entity.getNome()).ifPresent(dto::setNome);	
			 
			
			return dto;
		}
		
		public VendedorDTO fromWithVendas(Vendedor entity) {
			VendedorDTO dto = from(entity);
			if(ofNullable(entity.getVendas()).isPresent()) {
				dto.setVendas( new ArrayList<>() );
				entity.getVendas().forEach(o->{
					dto.getVendas().add(venda.from(o));
				});
				
				
			}
			
			return dto;
		}

		//usar para novos cadastros
		@Override
		public Vendedor to(VendedorDTO dto) {
			Vendedor entity = new Vendedor();
			
			ofNullable(dto.getId()).ifPresent(entity::setId);
			ofNullable(dto.getNome()).ifPresent(entity::setNome);		
			return entity;
		}

		//usar para atualização | put
		@Override 
		public Vendedor to(VendedorDTO dto, Vendedor entity) {
			
			ofNullable(dto.getId()).ifPresent(entity::setId);
			ofNullable(dto.getNome()).ifPresent(entity::setNome);			
			return entity;
		}

}
