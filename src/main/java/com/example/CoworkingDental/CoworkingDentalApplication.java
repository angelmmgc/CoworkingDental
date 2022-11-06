package com.example.CoworkingDental;


import com.example.CoworkingDental.entities.Clinica;
import com.example.CoworkingDental.entities.Rol;
import com.example.CoworkingDental.entities.Usuario;
import com.example.CoworkingDental.repository.ClinicaRepository;
import com.example.CoworkingDental.repository.RolRepository;
import com.example.CoworkingDental.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class CoworkingDentalApplication {

	public static void main(String[] args) {


		ApplicationContext context= SpringApplication.run(CoworkingDentalApplication.class, args);

		//CREAMOS REPOSITORIO PARA GUARDAR LOS USUARIOS EN LA BASE DE DATOS
		UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);

		//USUARIOS ADMINISTRADORES
		Usuario usuario3 = new Usuario(
				70,"jorge",
				"oliver martinez",
				"jorge@gmail",
				"7a",
				"444009988",
				"70a"
		);


		//USUARIOS CLIENTES
		Usuario usuario1 = new Usuario
						(60,
						"teresa",
						"ramirez ortensia",
						"teresa@gmail.com",
						"5a",
						"666995533",
						"50a");
		Usuario usuario2 = new Usuario
				(50,
						"ramon",
						"cortes cortes",
						"ramon@gmail.com",
						"6a",
						"777995533",
						"60a");



		//CREAMOS UN ROL

		RolRepository rolRepository = context.getBean(RolRepository.class);
		//ROL CLIENTE
		Rol rol1 = new Rol(222,"cliente general","cliente general");

		//ROL ADMINISTRADOR
		Rol rol2 = new Rol(111,"admin2","administrador tipo 2");
		//GUARDAMOS EN UNA LISTA DE TIPO ROL EL ROL1
		List<Rol> roles = Collections.singletonList(rol1);
		List<Rol> roles2 = Collections.singletonList(rol2);



		//ASOCIACION USUARIO-ROL
		//LE ASIGNAMOS AL USUARIO1 EL ROL
		usuario1.setRol(roles);//usuario cliente
		usuario2.setRol(roles);//usuario cliente
		usuario3.setRol(roles2);//usuario admin
		//LO GUARDAMOS EN EL REPOSITORIO(base de datos)
		usuarioRepository.save(usuario1);
		usuarioRepository.save(usuario2);
		usuarioRepository.save(usuario3);


		//ASOCIACION CLINICA USUARIO ADMINISTRADOR

		//CREAMOS UN REPOSITORIO DE CLINICA
		ClinicaRepository clinicaRepository = context.getBean(ClinicaRepository.class);
		//CREAMOS EL OBJETO CLINICA
		Clinica clinica1 = new Clinica(105,
				"dental marc",
				"dentalmarc@gmail",
				"888121212",
				"lorca 4",
				2);


		Clinica clinica2 = new Clinica(106,
				"pietro dental",
				"pietro@gmail",
				"888121212",
				"lorca 4",
				1);

		//GUARDAMOS LA CLINICA EN BASE DE DATOS
		clinicaRepository.save(clinica1);

	//List<Clinica> clinicas = Collections.singletonList(clinica1)
    List<Clinica> clinicas = new ArrayList<>();
	clinicas.add(clinica1);
	clinicas.add(clinica2);
		System.out.println("MIS CLINICAS");
		System.out.println(clinicas
		 );

		System.out.println("FIN MIS CLINICAS");
		//LO GUARDAMOS EN EL REPOSITORIO(base de datos)
		usuario3.setClinicas(clinicas);
		usuarioRepository.save(usuario3);








	}

}
