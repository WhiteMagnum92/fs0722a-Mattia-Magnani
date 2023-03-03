package com.WeeklyProjectJpa.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;
import com.WeeklyProjectJpa.models.Edificio;
import com.WeeklyProjectJpa.models.Postazione;
import com.WeeklyProjectJpa.models.Prenotazione;
import com.WeeklyProjectJpa.models.Utente;
import com.WeeklyProjectJpa.services.EdificioService;
import com.WeeklyProjectJpa.services.PostazioneService;
import com.WeeklyProjectJpa.services.PrenotazioneService;
import com.WeeklyProjectJpa.services.UtenteService;


@Component
public class WeeklyProjectJpaRunner implements ApplicationRunner {
	
	@Autowired UtenteService utenteService;
	@Autowired PostazioneService postazioneService;
	@Autowired PrenotazioneService prenotazioneService;
	@Autowired EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Runner is running...");
		
		/*
		 * Utente u1 = new Utente ("bubmo", "Noemi_Marino", "n.marino@example.com");
		 * Utente u2 = new Utente ("gigino", "Noemi_Marianna",
		 * "n.marianna@example.com"); Utente u3 = new Utente ("mariello",
		 * "Marianna_Marianno", "m.marianno@example.com");
		 * 
		 * Edificio e = new Edificio (); e.setNome("malatestiana");
		 * e.setIndirizzo("Via clickclack"); e.setCitta("Cesena");
		 * 
		 * Postazione p1 = new Postazione(); p1.setDescrizione("sala_a");
		 * p1.setEdificio(e); p1.setTipo(TipologiaPostazione.OPENSPACE);
		 * p1.setNMaxOccupanti(40);
		 * 
		 * Postazione p2 = new Postazione(); p2.setDescrizione("sala_b");
		 * p2.setEdificio(e); p2.setTipo(TipologiaPostazione.SALA_RIUNIONI);
		 * p2.setNMaxOccupanti(10);
		 * 
		 * utenteService.insertUser(u1); utenteService.insertUser(u2);
		 * utenteService.insertUser(u3);
		 * 
		 * edificioService.insertEdificio(e);
		 * 
		 * postazioneService.insertPostazione(p1);
		 * postazioneService.insertPostazione(p2);
		 */
		
		Utente u1 = utenteService.getUtenteByUsername("gigino");
		Postazione p1 = postazioneService.getPostazioneById(1);
		Prenotazione p = new Prenotazione();
		p.setUtente(u1);
		p.setPostazione(p1);
		p.setData(LocalDate.now());
		prenotazioneService.insertPrenotazione(p);
		
	}
}
