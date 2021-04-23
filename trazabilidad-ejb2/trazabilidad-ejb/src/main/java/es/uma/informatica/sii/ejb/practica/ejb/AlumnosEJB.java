package es.uma.informatica.sii.ejb.practica.ejb;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import es.uma.informatica.sii.ejb.practica.ejb.exceptions.*;
import es.uma.informatica.sii.ejb.practica.entidades.*;


@Stateless
public class AlumnosEJB {
	
	private static final Logger LOG = Logger.getLogger(GruposEJB.class.getCanonicalName());
	
	@PersistenceContext(name="Trazabilidad")
	private EntityManager em;

	public void insertar(Alumno alumno) throws TrazabilidadException {
		if (alumno == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Alumno alumnoEntity = em.find(Alumno.class, alumno);
		if (alumnoEntity == null) {
			em.persist(alumno);
		}
	}
	
	public void eliminar(Alumno alumno) throws TrazabilidadException {
		if (alumno == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Alumno alumnoEntity = em.find(Alumno.class, alumno);
		if (alumnoEntity != null) {
			em.remove(alumnoEntity);
		}
	}
	
	public void modificar(Alumno alumno) throws TrazabilidadException {
		if (alumno == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Alumno alumnoEntity = em.find(Alumno.class, alumno);
		if (alumnoEntity != null) {
			em.remove(alumnoEntity);
			em.persist(alumno);
		}
	}
	
	public Alumno obtener(int id) throws TrazabilidadException {
		Alumno alumnoEntity = em.find(Alumno.class, id);
		if (alumnoEntity == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return alumnoEntity;
	}
	
	public List<Alumno> obtenerGrupos() throws TrazabilidadException {
		List<Alumno> alumnos = em.createQuery("Select * from Grupo", Alumno.class).getResultList();
		if (alumnos == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return alumnos;
	}
	
	public void insertarDeArchivo() {
		String nombreCompleto = "";
		int numArchivo = 0;
		String fechaMatricula = "";
		String turno_preferencia = "";
		Scanner sc = new Scanner(System.in);
		Alumno alumno = new Alumno();
		Expediente expediente = new Expediente();
		while(sc.hasNextLine()) {
			String aux = sc.nextLine();
			Scanner sc2 = new Scanner(aux);
			while(sc2.hasNext()) {
				alumno.setDNI(sc.nextInt());
				nombreCompleto = sc.next() + sc.next() + sc.next();
				alumno.setNombreCompleto(nombreCompleto);
				expediente.setNumExpediente(sc.nextInt());
				numArchivo = sc.nextInt();
				alumno.setEmailInstitucional(sc.next());
				alumno.setEmailPersonal(sc.next());
				alumno.setTelefono(sc.nextInt());
				alumno.setMovil(sc.nextInt());
				alumno.setDireccionNotificacion(sc.next());
				alumno.setLocalidadNotificacion(sc.next());
				alumno.setProvinciaNotificacion(sc.next());
				alumno.setCpNotificacion(sc.nextInt());
				fechaMatricula = sc.next();
				turno_preferencia = sc.next();
				
				
			}
		}
	}
}
