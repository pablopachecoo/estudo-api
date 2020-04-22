package br.com.alura.forum.model;

import java.util.List;
import java.util.stream.Collectors;

public class MotoDto {

	public Long id;
	public Marca marca;
	public String modelo;

	
	
	public MotoDto(Moto moto) {
		this.id = moto.getId();
		this.marca = moto.getMarca();
		this.modelo = moto.getModelo();
	}

	public Long getId() {
		return id;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public static List<MotoDto> converter(List<Moto> motos) {
		return motos.stream().map(MotoDto::new).collect(Collectors.toList());
	}

}
