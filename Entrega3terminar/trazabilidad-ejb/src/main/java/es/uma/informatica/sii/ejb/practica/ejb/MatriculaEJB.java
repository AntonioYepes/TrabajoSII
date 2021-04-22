package es.uma.informatica.sii.ejb.practica.ejb;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.practica.ejb.exceptions.TrazabilidadException;
import es.uma.informatica.sii.ejb.practica.entidades.Matricula;

public class MatriculaEJB {
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;
	
	public void insertar(Matricula matricula) throws TrazabilidadException {
		if (matricula == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Matricula matriculaEntity = em.find(Matricula.class, matricula);
		if (matriculaEntity == null) {
			em.persist(matricula);
		}
	}

	public List<Matricula> obtenerMatriculas() throws TrazabilidadException {
		List<Matricula> matriculas = em.createQuery("Select * from Matricula", Matricula.class).getResultList();
		if (matriculas == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return matriculas;
	}

	public void eliminar(Matricula matricula) throws TrazabilidadException {
		if (matricula == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Matricula matriculaEntity = em.find(Matricula.class, matricula);
		if (matriculaEntity != null) {
			em.remove(matriculaEntity);
		}
		
	}
	
	public void modificar(Matricula matricula) throws TrazabilidadException {
		if (matricula == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Matricula matriculaEntity = em.find(Matricula.class, matricula);
		if (matriculaEntity != null) {
			em.remove(matriculaEntity);
			em.persist(matricula);
		}
	}
	

	public Matricula obtener(int id) throws TrazabilidadException {
		Matricula matriculaEntity = em.find(Matricula.class, id);
		if (matriculaEntity == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return matriculaEntity;
	}
}
