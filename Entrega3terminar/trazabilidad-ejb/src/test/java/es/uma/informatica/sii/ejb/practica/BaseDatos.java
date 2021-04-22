package es.uma.informatica.sii.ejb.practica;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.uma.informatica.sii.ejb.practica.entidades.*;


public class BaseDatos {
	public static void inicializaBaseDatos(String nombreUnidadPersistencia) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(nombreUnidadPersistencia);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Centro etsii = new Centro();
		etsii.setNombre("etsii");
		etsii.setDireccion("Malaga");
		etsii.setTelefonoConsejeria(952000000);
		
		Titulacion informatica = new Titulacion();
		informatica.setNombre("informatica");
		informatica.setCreditos(240);
		//informatica.setCentros(Stream.of(etsii).collect(Collectors.toList()));
		
		Titulacion computadores = new Titulacion();
		computadores.setNombre("computadores");
		computadores.setCreditos(240);
		//computadores.setCentros(Stream.of(etsii).collect(Collectors.toList()));
		
		Titulacion software = new Titulacion();
		software.setNombre("software");
		software.setCreditos(240);
		//software.setCentros(Stream.of(etsii).collect(Collectors.toList()));
		
		//Relacion de centro y titulaciones
		etsii.setTitulaciones(Stream.of(informatica, computadores, software).collect(Collectors.toList()));
		
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
