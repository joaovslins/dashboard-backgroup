package com.dashboard.converter;

import static java.util.Optional.ofNullable;

import org.springframework.stereotype.Component;

import com.dashboard.domain.Produto;
import com.dashboard.dto.ProdutoDTO;

@Component
public class ProdutoConverter implements Converter<Produto, ProdutoDTO> {
	
	//usar para consultas
			@Override
			public ProdutoDTO from(Produto entity) {
				ProdutoDTO dto = new ProdutoDTO();
				
				ofNullable(entity.getId()).ifPresent(dto::setId);
				ofNullable(entity.getNome()).ifPresent(dto::setNome);	
				ofNullable(entity.getPreco()).ifPresent(dto::setPreco);	
				ofNullable(entity.getDatacadastro()).ifPresent(dto::setDatacadastro);
				return dto;
			}

			//usar para novos cadastros
			@Override
			public Produto to(ProdutoDTO dto) {
				Produto entity = new Produto();
				
				ofNullable(dto.getId()).ifPresent(entity::setId);
				ofNullable(dto.getNome()).ifPresent(entity::setNome);
				ofNullable(dto.getPreco()).ifPresent(entity::setPreco);
				ofNullable(dto.getDatacadastro()).ifPresent(entity::setDatacadastro);
				return entity;
			}

			//usar para atualização | put
			@Override 
			public Produto to(ProdutoDTO dto, Produto entity) {
				
				ofNullable(dto.getId()).ifPresent(entity::setId);
				ofNullable(dto.getNome()).ifPresent(entity::setNome);
				ofNullable(dto.getPreco()).ifPresent(entity::setPreco);	
				ofNullable(dto.getDatacadastro()).ifPresent(entity::setDatacadastro);
				return entity;
			}

}
