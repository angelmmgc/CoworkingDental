package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipos_gabinete")
public class TiposGabinete {

    @Id
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descripcion")
    private String descripcion;

}
