package com.WeeklyProjectJpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;
import com.WeeklyProjectJpa.models.Postazione;

public interface PostazioneDaoRepository extends CrudRepository<Postazione, Integer> {

	public List<Postazione> findByTipo(TipologiaPostazione t);

	@Query("SELECT p FROM Postazione p JOIN Edificio e WHERE e.citta = :citta AND p.tipo = :t")
	public List<Postazione> findByCittaAndTipo(String citta, TipologiaPostazione t);
	


}
