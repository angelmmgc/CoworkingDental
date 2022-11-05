package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "alquileres")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alquiler")
    private Integer id_alquiler;
    @Column(name = "id_gabinete")
    private Integer id_gabinete;

    public Alquiler() {
    }

    public Alquiler(Integer id_alquiler, Integer id_gabinete) {
        this.id_alquiler = id_alquiler;
        this.id_gabinete = id_gabinete;
    }

    public Integer getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(Integer id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public Integer getId_gabinete() {
        return id_gabinete;
    }

    public void setId_gabinete(Integer id_gabinete) {
        this.id_gabinete = id_gabinete;
    }
}
