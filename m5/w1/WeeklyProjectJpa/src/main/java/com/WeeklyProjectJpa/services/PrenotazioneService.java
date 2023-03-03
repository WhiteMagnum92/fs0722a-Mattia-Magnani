package com.WeeklyProjectJpa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeeklyProjectJpa.models.Prenotazione;
import com.WeeklyProjectJpa.repositories.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneDaoRepository repo;

	public void insertPrenotazione(Prenotazione p) {
		List<Prenotazione> listaPrenotazioni = (List<Prenotazione>) repo.findAll();
		listaPrenotazioni = listaPrenotazioni.stream()
				.filter(e -> e.getData().compareTo(p.getData())==0 && e.getPostazione() == p.getPostazione())
				.collect(Collectors.toList());
		if (listaPrenotazioni.isEmpty()) {
			listaPrenotazioni = (List<Prenotazione>) repo.findAll();
			listaPrenotazioni = listaPrenotazioni.stream()
					.filter(e -> e.getUtente() == p.getUtente() && e.getData().compareTo(p.getData())==0)
					.collect(Collectors.toList());
			if (listaPrenotazioni.isEmpty()) {
				repo.save(p);
			}
		}
	}

	public Prenotazione getPrenotazioneById(Integer id) {
		return repo.findById(id).get();
	}

	private void updatePrenotazione(Prenotazione p) {
		repo.save(p);
	}

	private void removePrenotazione(Prenotazione p) {
		repo.delete(p);
	}

	private List<Prenotazione> getAllPrenotazioni() {
		return (List<Prenotazione>) repo.findAll();
	}

	/*
	 * public List<User> getAgeBetween(Integer min, Integer max) { return
	 * repo.findByAgeBetween(min, max); }
	 */

}
