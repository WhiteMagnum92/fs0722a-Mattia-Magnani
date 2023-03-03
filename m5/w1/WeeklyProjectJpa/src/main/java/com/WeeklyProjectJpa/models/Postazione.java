package com.WeeklyProjectJpa.models;

import com.WeeklyProjectJpa.enums.TipologiaPostazione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Postazione {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column
	private String descrizione;
    @Column 
    @Enumerated(EnumType.STRING)
	private TipologiaPostazione tipo;
    @Column
	private Integer nMaxOccupanti;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_edificio")
	private Edificio edificio;
	
}