package com.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.converter.VendedorConverter;
import com.dashboard.domain.Vendedor;
import com.dashboard.dto.VendedorDTO;
import com.dashboard.service.AbstractService;
import com.dashboard.service.VendedorService;

@RestController
@RequestMapping(value="api/vendedor")
@CrossOrigin
public class VendedorController extends AbstractController<Vendedor, VendedorDTO, VendedorService, VendedorConverter>{

	public VendedorController(VendedorService service, VendedorConverter converter) {
		super(service, converter);
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public List<VendedorDTO> getAll() {
		List<VendedorDTO> AbstractDTOList = new ArrayList<>();

		service.getAll().forEach(a -> {
			AbstractDTOList.add(converter.fromWithVendas(a));
		});

		return AbstractDTOList;
	}

	

}
