package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
