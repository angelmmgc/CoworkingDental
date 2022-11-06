package com.example.CoworkingDental.entities;

import javax.persistence.*;

@Entity
@Table(name = "clinicas")
public class Clinica {
    @Id
    @Column(name = "id_clinica")
    private Integer id_clinica;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "num_gabinetes")
    private Integer num_gabinetes;

    //constructores


    public Clinica() {
    }

    public Clinica(Integer id_clinica, String nombre, String email, String telefono, String direccion, Integer num_gabinetes) {
        this.id_clinica = id_clinica;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.num_gabinetes = num_gabinetes;
    }

    //asociaciones


    //getter and setter


    public Integer getId_clinica() {
        return id_clinica;
    }

    public void setId_clinica(Integer id_clinica) {
        this.id_clinica = id_clinica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNum_gabinetes() {
        return num_gabinetes;
    }

    public void setNum_gabinetes(Integer num_gabinetes) {
        this.num_gabinetes = num_gabinetes;
    }

    //toString

    @Override
    public String toString() {
        return "Clinica{" +
                "id_clinica=" + id_clinica +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", num_gabinetes=" + num_gabinetes +
                '}';
    }
}
