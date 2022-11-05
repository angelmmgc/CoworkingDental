package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "administra")
public class Administra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id_usuario;
    @Column(name = "id_clinica")
    private Integer id_clinica;
}
