package es.uma.informatica.sii.ejb.practica.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.practica.ejb.exceptions.*;
import es.uma.informatica.sii.ejb.practica.entidades.*;

@Stateless
public class AsignaturasEJB {

	private static final Logger LOG = Logger.getLogger(GruposEJB.class.getCanonicalName());
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;
	
	public void insertar(Asignatura asignatura) throws TrazabilidadException {
		if (asignatura == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Asignatura asignaturaEntity = em.find(Asignatura.class, asignatura);
		if (asignaturaEntity == null) {
			em.persist(asignatura);
		}
	}
	
	public void eliminar(Asignatura asignatura) throws TrazabilidadException {
		if (asignatura == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Asignatura asignaturaEntity = em.find(Asignatura.class, asignatura);
		if (asignaturaEntity != null) {
			em.remove(asignaturaEntity);
		}
	}
	
	public void modificar(Asignatura asignatura) throws TrazabilidadException {
		if (asignatura == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Asignatura asignaturaEntity = em.find(Asignatura.class, asignatura);
		if (asignaturaEntity != null) {
			em.remove(asignaturaEntity);
			em.persist(asignatura);
		}
	}
	
	public Asignatura obtener(int id) throws TrazabilidadException {
		Asignatura asignaturaEntity = em.find(Asignatura.class, id);
		if (asignaturaEntity == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return asignaturaEntity;
	}
	
	public List<Asignatura> obtenerGrupos() throws TrazabilidadException {
		List<Asignatura> asignaturas = em.createQuery("Select * from Grupo", Asignatura.class).getResultList();
		if (asignaturas == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return asignaturas;
	}
}
