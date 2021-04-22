package es.uma.informatica.sii.ejb.practica.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EncuestaEJB {
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;
	
	
}
