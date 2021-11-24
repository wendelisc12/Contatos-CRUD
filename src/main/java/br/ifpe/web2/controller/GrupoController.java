package br.ifpe.web2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web2.model.Contato;
import br.ifpe.web2.model.ContatoDao;
import br.ifpe.web2.model.Grupo;
import br.ifpe.web2.model.GrupoDao;
import br.ifpe.web2.service.GrupoService;

@Controller
public class GrupoController {
	
	@Autowired
	private GrupoService grupoService;

	@GetMapping("/criarGrupo")
	public String exibirForm() {
		return "criar-grupo";
	}
	
	@PostMapping("/cadastrarGrupo")
	public String salvarGrupo(Grupo grupo) {
		grupoService.criarGrupo(grupo);
		return "index";
	}
	
}
