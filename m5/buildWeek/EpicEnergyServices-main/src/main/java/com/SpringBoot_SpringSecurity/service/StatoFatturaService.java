package com.SpringBoot_SpringSecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_SpringSecurity.entity.BeServiceStatoFattura;
import com.SpringBoot_SpringSecurity.repository.StatoFatturaRepository;

@Service
public class StatoFatturaService {

	@Autowired StatoFatturaRepository repo;
	
	public List<BeServiceStatoFattura> getAllFattura(){
		return (List<BeServiceStatoFattura>) repo.findAll();
	}
	public BeServiceStatoFattura getStatoFatturaById(Long id) {
		BeServiceStatoFattura u = repo.findById(id).get();
		return u;
	}

	public void createAll(List<BeServiceStatoFattura> list){
		repo.saveAll(list);
	}




}
