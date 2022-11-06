package com.example.CoworkingDental;


import com.example.CoworkingDental.entities.Rol;
import com.example.CoworkingDental.entities.Usuario;
import com.example.CoworkingDental.repository.RolRepository;
import com.example.CoworkingDental.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class CoworkingDentalApplication {

	public static void main(String[] args) {


		ApplicationContext context= SpringApplication.run(CoworkingDentalApplication.class, args);

		//CREAMOS UN USUARIO
		UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);

		Usuario usuario1 = new Usuario
						(50,
						"teresa",
						"ramirez ortensia",
						"teresa@gmail.com",
						"5a",
						"666995533",
						"50a");



		//CREAMOS UN ROL

		RolRepository rolRepository = context.getBean(RolRepository.class);
		Rol rol1 = new Rol(222,"cliente general","cliente general");

		//GUARDAMOS EN UNA LISTA DE TIPO ROL EL ROL1
		List<Rol> roles = Collections.singletonList(rol1);
		//LE ASIGNAMOS AL USUARIO1 EL ROL
		usuario1.setRol(roles);
		//LO GUARDAMOS EN EL REPOSITORIO
		usuarioRepository.save(usuario1);






		//ASOCIACION USUARIO-ROL

	}

}
