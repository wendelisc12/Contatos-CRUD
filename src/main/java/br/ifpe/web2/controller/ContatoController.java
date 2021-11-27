package br.ifpe.web2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.ifpe.web2.model.Contato;
import br.ifpe.web2.service.ContatoService;
import br.ifpe.web2.service.GrupoService;

@Controller
public class ContatoController {
	
	@Autowired
	ContatoService contatoService;
	
	@Autowired
	GrupoService grupoService;

	@GetMapping("/exibirContato")
	public String exibirForm(Contato contato, Model model) {
		model.addAttribute("listGrupo", grupoService.listarGrupoVigente());
		return "contatos-form";
	}
	
	@PostMapping("/salvarContato")
	public String salvarContato(Contato contato) {
		contatoService.salvarContato(contato);
		return "redirect:/listarContatos";
	}
	
	@GetMapping("/listarContatos")
	public String listarContatos(Model model) {
		model.addAttribute("lista", contatoService.listarContato());
		return "contatos-list";
	}
	
	
	@GetMapping("/removerContato")
	public String removerContato(String email) {
		contatoService.deletarContatoById(email);
		return "redirect:/listarContatos";
	}
	
	@GetMapping("/editarContato")
	public String editarContato(String email, Model model) {
		model.addAttribute("listGrupo", grupoService.listarGrupoVigente());
		model.addAttribute("contato", contatoService.buscarContato(email));
		return "contatos-form";
	}
}
