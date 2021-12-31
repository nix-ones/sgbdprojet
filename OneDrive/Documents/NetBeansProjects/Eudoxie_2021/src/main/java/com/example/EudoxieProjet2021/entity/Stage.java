/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.EudoxieProjet2021.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;



/**
 *
 * @author Tictopia
 */
@Entity
@Table(name = "stages")
public class Stage {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    
@Column(name = "nom")
private String nom;

@Column(name = "ageMin")
private Integer ageMin;

@Column(name = "ageMax")
private Integer ageMax;

@Column(name="datedeb")
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date datedeb;

@Column(name="datefin")
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date datefin;
    
}
