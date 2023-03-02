package com.GodfathersPizza.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.GodfathersPizza.enums.StatOrdine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PropertySource("classpath:application.properties")
public class Ordine {
	
	private Tavolo tavolo;
	private Integer nOrdine;
	private StatOrdine stato = StatOrdine.IN_CORSO;
	private Integer nCoperti = 1;
	private LocalDateTime oraOrdine = LocalDateTime.now();
	private Map<Integer, Prodotto> ordinato = new HashMap<Integer, Prodotto>();
	@Value("${GodfathersPizza.costoCoperto}")
	private double costoCoperto;
	
	public Prodotto addProdotto(Prodotto p) {
		ordinato.put(ordinato.size()+1, p);
		return ordinato.get(p);
	}
	
	public void removeProddotto(Prodotto p) {
		if(ordinato.containsKey(p)) {
			ordinato.remove(p);
		}else {
			System.out.println("Nessun prodotto nell'ordine!");
		}
	}
	
	public double calcolaTotaleOrdine() {
		return costoCoperto;
	}
	

}
