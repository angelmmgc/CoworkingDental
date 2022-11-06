package com.example.CoworkingDental.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name ="roles")
public class Rol implements Serializable {


    /**
     * atributo id autogenerado
     */
    @Id
    @Column(name = "cod_rol")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    //constructor
    public Rol() {
    }

    public Rol(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    //asociaciones


    //getter y setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    //toString
    @Override
    public String toString() {
        return "Rol{" +
                "cod_rol=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
