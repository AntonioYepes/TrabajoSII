package es.uma.informatica.sii.ejb.practica.entidades;

import javax.persistence.*;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GrupoN5V2");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();

	}

}
