package com.WeeklyProjectJpa.models;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;

public class Postazione {

	Integer idPostazione;
	String descrizione;
	TipologiaPostazione tipo;
	Integer nMaxOccupanti;
	Edificio edificio;
	
}