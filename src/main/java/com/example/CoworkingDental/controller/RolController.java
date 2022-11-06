package com.example.CoworkingDental.controller;

import com.example.CoworkingDental.entities.Rol;
import com.example.CoworkingDental.service.RolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RolController {

    private final RolService rolService;

    //constructor

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    /**
     * funcion que obtiene todos los datos de la tabla rol
     * @return
     */
    @GetMapping("/")
    public List<Rol> findALl(){

        return rolService.findAll();
    }

    /**
     * funcion que obtiene una fila segun el cod_rol
     * @param
     * @return respuesta ok o not found
     */
    @GetMapping("/roles-usuarios/{cod_rol}")
    public ResponseEntity<Rol> findById(@PathVariable Integer cod_rol){
        System.out.println("hola" + cod_rol);
        Optional<Rol> rolOpt = rolService.findByID(cod_rol);
/*
  if (rolOpt.isPresent())
            return ResponseEntity.ok(rolOpt.get());
        else
            return ResponseEntity.notFound().build();
 */

        return rolOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

        }

    @DeleteMapping("/api/delete/{id}")
    public ResponseEntity<Rol> deleteRol(@PathVariable("cod_rol") Integer id){

       rolService.delete(id);
        return ResponseEntity.ok().build();
    }
    }

