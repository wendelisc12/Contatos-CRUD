package br.ifpe.web2.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web2.model.Grupo;
import br.ifpe.web2.model.GrupoDao;

@Service
public class GrupoService {
	
	
	@Autowired
	private GrupoDao grupoDao;
	
	public void criarGrupo(Grupo grupo) {
		grupoDao.save(grupo);
	}
	
	public void deletarGrupo(Integer id) {
		grupoDao.deleteById(id);
	}
	
	public void editarGrupo(Grupo grupo) {
		grupoDao.save(grupo);
	}
	
	public List<Grupo> listarGrupos(){
		return grupoDao.findAll();
	}
	
	public List<Grupo> listarGrupoVigente(){
		return grupoDao.findByDataDeExpiracaoAfter(LocalDate.now());
	}
	
	public Grupo buscarGrupo(Integer id) {
		return grupoDao.findById(id).get();
	}
}
