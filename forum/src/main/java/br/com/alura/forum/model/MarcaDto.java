package br.com.alura.forum.model;

public class MarcaDto {

	public Long id;
	public String nome;
	public Long cnpj;
	public String endereco;

	public MarcaDto(Marca marca) {
		this.id = marca.getId();
		this.nome = marca.getNome();
		this.cnpj = marca.getCnpj();
		this.endereco = marca.getEndereco();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public String getEndereco() {
		return endereco;
	}


}
