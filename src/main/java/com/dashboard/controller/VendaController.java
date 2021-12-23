package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.converter.VendaConverter;
import com.dashboard.domain.Venda;
import com.dashboard.dto.VendaDTO;
import com.dashboard.service.VendaService;

@RestController
@RequestMapping(value = "/api/venda")
@CrossOrigin
public class VendaController extends AbstractController<Venda, VendaDTO, VendaService, VendaConverter>{

	
	public VendaController(@Autowired VendaService service, VendaConverter converter) {
		super(service, converter);
		// TODO Auto-generated constructor stub
	}
	
	
}
