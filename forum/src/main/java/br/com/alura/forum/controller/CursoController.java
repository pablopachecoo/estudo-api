package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Moto;

@RestController
public class CursoController {
	
	@RequestMapping("/cursos")
	public List<Moto> lista() {
		Moto curso = new Moto("marca", "modelo");
		return Arrays.asList(curso, curso, curso);
	}

}
