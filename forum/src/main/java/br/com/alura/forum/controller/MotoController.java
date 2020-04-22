package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.h2.engine.Database;
import org.h2.security.auth.H2AuthConfig;
import org.h2.store.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Marca;
import br.com.alura.forum.model.Moto;
import br.com.alura.forum.model.MotoDto;
import br.com.alura.forum.repository.MotoRepository;

@RestController
public class MotoController {

	@Autowired
	private MotoRepository motoRepository;

	// Retorna 3 Motos e os seus Atributos, (Id, Marca e Modelo).
	@RequestMapping("/motos")
	public List<Moto> lista() {

		List<Moto> motos = motoRepository.findAll();
		return motos;

	}

	// Retorna 3 Motos, e os Atributos (id e marca)

	@RequestMapping("/motosdto")
	public List<MotoDto> listadto() {
		// Moto moto01 = new Moto(new Marca("Honda", (long) 123456, "rua 10",
		// "mauricio"), "XRE 190");
		List<Moto> motos = motoRepository.findAll();
		return MotoDto.converter(motos);
	}

}
