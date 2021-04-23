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


/**
 * Session Bean implementation class Sample
 */
@Stateless
public class GruposEJB{
	
	private static final Logger LOG = Logger.getLogger(GruposEJB.class.getCanonicalName());
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;

	public void insertar(Grupo grupo) throws TrazabilidadException {
		if (grupo == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Grupo grupoEntity = em.find(Grupo.class, grupo);
		if (grupoEntity == null) {
			em.persist(grupo);
		}
	}

	public List<Grupo> obtenerGrupos() throws TrazabilidadException {
		List<Grupo> grupos = em.createQuery("Select * from Grupo", Grupo.class).getResultList();
		if (grupos == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return grupos;
	}

	public void eliminar(Grupo grupo) throws TrazabilidadException {
		if (grupo == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Grupo grupoEntity = em.find(Grupo.class, grupo);
		if (grupoEntity != null) {
			em.remove(grupoEntity);
		}
		
	}
	
	public void modificar(Grupo grupo) throws TrazabilidadException {
		if (grupo == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Grupo grupoEntity = em.find(Grupo.class, grupo);
		if (grupoEntity != null) {
			em.remove(grupoEntity);
			em.persist(grupo);
		}
	}
	

	public Grupo obtener(int id) throws TrazabilidadException {
		Grupo grupoEntity = em.find(Grupo.class, id);
		if (grupoEntity == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return grupoEntity;
	}
	
}