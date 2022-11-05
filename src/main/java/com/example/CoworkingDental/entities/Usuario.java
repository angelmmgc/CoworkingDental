package com.example.CoworkingDental.entities;

import org.springframework.boot.context.event.SpringApplicationEvent;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {


    /**
     * atributo id autogenerado
     */
    @Id
    @Column(name = "id_usuario")
    private Integer id_usuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "token")
    private String token;


    //constructores

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String nombre, String apellidos, String email, String password, String telefono, String token) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.token = token;
    }

    @ManyToMany(cascade = CascadeType.ALL)//asociaciones
    @JoinTable(
            name="roles_usuario",
            joinColumns = @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "cod_rol",referencedColumnName = "cod_rol")
    )
    private List<Rol> rol;

    //getter and setter


    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Rol> getRol() {
        return rol;
    }

    public void setRol(List<Rol> rol) {
        this.rol = rol;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telefono='" + telefono + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
