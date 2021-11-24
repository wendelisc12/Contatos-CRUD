package br.ifpe.web2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web2.model.Contato;
import br.ifpe.web2.model.ContatoDao;

@Service
public class ContatoService {

	@Autowired
	private ContatoDao contatoDao;
	
	public void salvarContato(Contato contato) {
		contatoDao.save(contato);
	}
	public List<Contato> listarContato() {
		return contatoDao.findAll();
	}
	
	public void deletarContatoById(String id) {
		contatoDao.deleteById(id);
	}
	
	public Contato buscarContato(String id) {
		return contatoDao.findById(id).get();
	}
}
