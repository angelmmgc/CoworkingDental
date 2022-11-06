package com.example.CoworkingDental.service;

import com.example.CoworkingDental.entities.Rol;


import javax.swing.*;
import java.util.List;
import java.util.Optional;
public interface RolService {

    Optional<Rol> findByID(Integer id);

    List<Rol> findAll();

     void delete(Integer id);
}
