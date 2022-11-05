package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "gabinetes")
public class Gabinete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_gabinete;
    private Integer id_clinica;
    private String tipo;
}
