package com.dashboard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.converter.ProdutoConverter;
import com.dashboard.domain.Produto;
import com.dashboard.dto.ProdutoDTO;
import com.dashboard.service.ProdutoService;


@RestController
@RequestMapping(value="api/produto")
@CrossOrigin
public class ProdutoController extends AbstractController<Produto, ProdutoDTO, ProdutoService, ProdutoConverter>{

	public ProdutoController(ProdutoService service, ProdutoConverter converter) {
		super(service, converter);
		// TODO Auto-generated constructor stub
	}

}
