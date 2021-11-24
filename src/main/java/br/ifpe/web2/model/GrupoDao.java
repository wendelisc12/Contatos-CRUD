package br.ifpe.web2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoDao extends JpaRepository<Grupo, String> {
	public List<Grupo> findByDataDeExpiracaoBefore(LocalDate DataExpiracao);
}
