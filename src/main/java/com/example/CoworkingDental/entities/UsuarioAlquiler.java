package com.example.CoworkingDental.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario_alquiler")
public class UsuarioAlquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    @Column(name = "id_alquiler")
    private Integer id_alquiler;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "num_colegiado")
    private Integer num_colegiado;

}
