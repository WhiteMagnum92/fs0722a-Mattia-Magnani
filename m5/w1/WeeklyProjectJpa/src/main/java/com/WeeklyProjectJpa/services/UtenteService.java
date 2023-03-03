package com.WeeklyProjectJpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeeklyProjectJpa.models.Utente;
import com.WeeklyProjectJpa.repositories.UtenteDaoRepository;


@Service
public class UtenteService {
	
	@Autowired UtenteDaoRepository repo;
	
	public void insertUser(Utente u) {
		repo.save(u);
	}
	
	public Utente getUtenteByUsername(String username) {	
		return repo.findById(username).get();
	}
	
	private void updateUtente(Utente u) {
		repo.save(u);
	}
	
	private void removeUtente(Utente u) {
		repo.delete(u);
	}
	
	private List<Utente> getAllUtente() {
		return (List<Utente>) repo.findAll();
	}
	
	/*
	 * public List<User> getAgeBetween(Integer min, Integer max) { return
	 * repo.findByAgeBetween(min, max); }
	 */

}
