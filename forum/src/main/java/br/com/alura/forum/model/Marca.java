package br.com.alura.forum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca {

	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long id;
	public String nome;
	public Long cnpj;
	public String endereco;
	public String representante;

	public Marca() {
		
	}
	
	public Marca(String nome, Long cnpj, String endereco, String representante) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.representante = representante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

}
