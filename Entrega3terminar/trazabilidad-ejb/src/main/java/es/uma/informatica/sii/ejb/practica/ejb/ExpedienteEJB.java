package es.uma.informatica.sii.ejb.practica.ejb;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.practica.ejb.exceptions.TrazabilidadException;
import es.uma.informatica.sii.ejb.practica.entidades.Expediente;

public class ExpedienteEJB {
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;
	
	public void insertar(Expediente expediente) throws TrazabilidadException {
		if (expediente == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Expediente expedienteEntity = em.find(Expediente.class, expediente);
		if (expedienteEntity == null) {
			em.persist(expediente);
		}
	}

	public List<Expediente> obtenerExpedientes() throws TrazabilidadException {
		List<Expediente> expedientes = em.createQuery("Select * from Expediente", Expediente.class).getResultList();
		if (expedientes == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return expedientes;
	}

	public void eliminar(Expediente expediente) throws TrazabilidadException {
		if (expediente == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Expediente expedienteEntity = em.find(Expediente.class, expediente);
		if (expedienteEntity != null) {
			em.remove(expedienteEntity);
		}
		
	}
	
	public void modificar(Expediente expediente) throws TrazabilidadException {
		if (expediente == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Expediente expedienteEntity = em.find(Expediente.class, expediente);
		if (expedienteEntity != null) {
			em.remove(expedienteEntity);
			em.persist(expediente);
		}
	}
	

	public Expediente obtener(int id) throws TrazabilidadException {
		Expediente expedienteEntity = em.find(Expediente.class, id);
		if (expedienteEntity == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return expedienteEntity;
	}
}
