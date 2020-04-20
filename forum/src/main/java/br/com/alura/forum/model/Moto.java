package br.com.alura.forum.model;

public class Moto {

	private Long id;
	private String Marca;
	private String Modelo;

	public Moto(String marca, String modelo) {
		Marca = marca;
		Modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

}
