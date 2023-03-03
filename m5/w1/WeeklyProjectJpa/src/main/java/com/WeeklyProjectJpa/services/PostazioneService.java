package com.WeeklyProjectJpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;
import com.WeeklyProjectJpa.models.Postazione;
import com.WeeklyProjectJpa.repositories.PostazioneDaoRepository;


@Service
public class PostazioneService {
	
	@Autowired PostazioneDaoRepository repo;
	
	public void insertPostazione(Postazione p) {
		repo.save(p);
	}
	
	public Postazione getPostazioneById(Integer id) {	
		return repo.findById(id).get();
	}
	
	public List<Postazione> getPostazioniByType(TipologiaPostazione t) {	
		return repo.findByTipo(t);
	}
	
	public List<Postazione> getPostazioniByCittaAndTipo(String citta,TipologiaPostazione t) {	
		return repo.findByCittaAndTipo(citta,t);
	}
	
	private void updatePostazione(Postazione p) {
		repo.save(p);
	}
	
	private void removePostazione(Postazione p) {
		repo.delete(p);
	}
	
	private List<Postazione> getAllPostazioni() {
		return (List<Postazione>) repo.findAll();
	}
	
	/*
	 * public List<User> getAgeBetween(Integer min, Integer max) { return
	 * repo.findByAgeBetween(min, max); }
	 */

}
