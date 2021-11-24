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
	
	public void deletarGrupo(Grupo grupo) {
		grupoDao.delete(grupo);
	}
	
	public List<Grupo> listarGrupoVigente(){
		return grupoDao.findByDataDeExpiracaoBefore(LocalDate.now());
	}
	
	public Grupo buscarGrupo(String id) {
		return grupoDao.findById(id).get();
	}
}
