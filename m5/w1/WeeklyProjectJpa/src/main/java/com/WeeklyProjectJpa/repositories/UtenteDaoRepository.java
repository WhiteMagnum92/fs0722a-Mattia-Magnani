package com.WeeklyProjectJpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.WeeklyProjectJpa.models.Utente;

public interface UtenteDaoRepository extends CrudRepository<Utente, String> {

}
