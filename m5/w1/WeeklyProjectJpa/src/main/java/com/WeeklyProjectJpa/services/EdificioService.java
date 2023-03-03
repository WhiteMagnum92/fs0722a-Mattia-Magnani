package com.WeeklyProjectJpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeeklyProjectJpa.models.Edificio;
import com.WeeklyProjectJpa.models.Utente;
import com.WeeklyProjectJpa.repositories.EdificioDaoRepository;
import com.WeeklyProjectJpa.repositories.UtenteDaoRepository;


@Service
public class EdificioService {
	
	@Autowired EdificioDaoRepository repo;
	
	public void insertEdificio(Edificio e) {
		repo.save(e);
	}
	
	public Edificio getEdificioById(Integer id) {	
		return repo.findById(id).get();
	}
	
	private void updateEdificio(Edificio e) {
		repo.save(e);
	}
	
	private void removeEdificio(Edificio e) {
		repo.delete(e);
	}
	
	private List<Edificio> getAllEdifici() {
		return (List<Edificio>) repo.findAll();
	}
	
	/*
	 * public List<User> getAgeBetween(Integer min, Integer max) { return
	 * repo.findByAgeBetween(min, max); }
	 */

}
