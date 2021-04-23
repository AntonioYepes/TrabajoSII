package es.uma.informatica.sii.ejb.practica.ejb;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.practica.ejb.exceptions.TrazabilidadException;
import es.uma.informatica.sii.ejb.practica.entidades.*;


public class Asignaturas_MatriculaEJB {
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;
	
	public void cambiarGrupo(Matricula matricula, Grupo grupo) {
		
	}

}
