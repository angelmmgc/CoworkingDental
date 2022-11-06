package com.example.CoworkingDental.service.impl;

import com.example.CoworkingDental.entities.Rol;
import com.example.CoworkingDental.repository.RolRepository;
import com.example.CoworkingDental.service.RolService;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;
@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    //constructor
    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    /**
     *
     * @param  id
     * @return devolvera todos los registros de la tabla
     */
    @Override
    public Optional<Rol> findByID(Integer id) {
        System.out.println("estoy aqui");


        if (id == null || id <= 0){
            return Optional.empty();
        }

        return rolRepository.findById(id);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        System.out.println(id);
        rolRepository.deleteById(id);
    }



}
