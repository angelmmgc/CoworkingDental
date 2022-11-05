package com.example.CoworkingDental.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="roles")
public class Rol implements Serializable {


    /**
     * atributo id autogenerado
     */
    @Id
    @Column(name = "cod_rol")
    private Integer cod_rol;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    //constructor


    public Rol() {
    }

    public Rol(Integer cod_rol, String nombre, String descripcion) {
        this.cod_rol = cod_rol;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    //asociaciones


    //getter y setter

    public Integer getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(Integer cod_rol) {
        this.cod_rol = cod_rol;
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
                "cod_rol=" + cod_rol +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
