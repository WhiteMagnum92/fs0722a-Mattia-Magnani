package com.WeeklyProjectJpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;
import com.WeeklyProjectJpa.models.Postazione;
import com.WeeklyProjectJpa.models.Prenotazione;

public interface PrenotazioneDaoRepository extends CrudRepository<Prenotazione, Integer> {
	@Query("SELECT p FROM Prenotazione p JOIN Postazione p1 WHERE p1.tipo = :t")
	public List<Postazione> findByTipo(TipologiaPostazione t);
	
}
