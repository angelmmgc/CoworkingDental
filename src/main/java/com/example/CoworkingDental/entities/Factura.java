package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;
    @Column(name="id_alquiler")
    private String id_alquiler;
    @Column(name = "tasa")
    private Integer tasa;
    @Column(name = "iva")
    private Integer iva;//debe ser una constante
    @Column(name = "total")
    private Integer total;
}
