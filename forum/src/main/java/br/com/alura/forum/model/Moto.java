package br.com.alura.forum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Moto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne
	private Marca marca;
	private String Modelo;

	public Moto() {
		
	}
	
	public Moto(Marca marca, String modelo) {
		this.marca = marca;
		Modelo = modelo;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Marca getMarca() {
		return marca;
	}
	

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

}
