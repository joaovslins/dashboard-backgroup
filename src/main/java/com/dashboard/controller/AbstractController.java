package com.dashboard.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dashboard.authentication.AuthenticationUtil;
import com.dashboard.converter.Converter;
import com.dashboard.dto.AbstractDTO;
import com.dashboard.service.AbstractService;

public abstract class AbstractController<T, DTO extends AbstractDTO, S extends AbstractService<T, JpaRepository<T, Long>>, C extends Converter<T, DTO>> {

	protected S service;

	protected C converter;

	public AbstractController(S service, C converter) {
		super();
		this.service = service;
		this.converter = converter;
	}

	public void getFile(HttpServletResponse response, String filename) {
		try {
			File file = ResourceUtils.getFile("classpath:" + filename);
			InputStream in = new FileInputStream(file);
			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
			IOUtils.copy(in, response.getOutputStream());
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@GetMapping
	public List<DTO> getAll() {
		List<DTO> AbstractDTOList = new ArrayList<DTO>();

		service.getAll().forEach(a -> {
			AbstractDTOList.add(converter.from(a));
		});

		return AbstractDTOList;
	}

	@PostMapping
	public DTO create(@RequestBody @Valid DTO AbstractDTO) {

		return converter.from(service.save(converter.to(AbstractDTO)));

	}

	@PatchMapping
	public AbstractDTO update(@RequestBody @Valid DTO AbstractDTO) {
		return converter.from(
					service.save(converter.to(AbstractDTO, service.get(AbstractDTO.getId())))
				);
		
	}

	@DeleteMapping("/{id}")
	public AbstractDTO delete(@PathVariable("id") Long id) {
		service.delete(id);
		return null;

	}

	@GetMapping("/model")
	public void getModel(HttpServletResponse response) {
		getFile(response, "PROCEDIMENTOS.XLSX");

	}

}
