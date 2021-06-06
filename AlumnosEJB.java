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

	public void insertar(Alumno alumno) throws CRUDException {
		if (alumno == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		em.persist(alumno);
	}
	
	public void eliminar(Alumno alumno) throws CRUDException {
		if (alumno == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		Alumno alumnoEntity = em.find(Alumno.class, alumno.getID());
		if (alumnoEntity != null) {
			em.remove(alumnoEntity);
		}
	}
	
	public void modificar(Alumno alumno) throws CRUDException {
		Alumno al = obtener(alumno.getID());
		al.setDNI(alumno.getDNI());
		al.setNombreCompleto(alumno.getNombreCompleto());
		al.setEmailInstitucional(alumno.getEmailInstitucional());
		al.setEmailPersonal(alumno.getEmailPersonal());
		al.setTelefono(alumno.getTelefono());
		al.setMovil(alumno.getMovil());
		al.setDireccionNotificacion(alumno.getDireccionNotificacion());
		al.setLocalidadNotificacion(alumno.getLocalidadNotificacion());
		al.setProvinciaNotificacion(alumno.getProvinciaNotificacion());
		al.setCpNotificacion(alumno.getCpNotificacion());
	}
	
	public Alumno obtener(int ID) throws CRUDException {
		return em.find(Alumno.class, ID);
	}
	
	public List<Alumno> obtenerGrupos() throws CRUDException {
		List<Alumno> alumnos = em.createQuery("Select * from Grupo", Alumno.class).getResultList();
		if (alumnos == null) {
			throw new RuntimeErrorException(null, "Error a cambiar");
		}
		return alumnos;
	}
	
	public int cuentaAlumnos() throws CRUDException{
        List<Alumno> alumnos = em.createQuery("Select DNI from Alumno", Alumno.class).getResultList();
        return alumnos.size();
    }
	
	public void insertarDeArchivo(File nombreArchivo) throws CRUDException, FileNotFoundException{
		String nombreCompleto = "";
		int numArchivo = 0;
		String fechaMatricula = "";
		String turno_preferencia = "";
		String grupos_asignados = "";
		Scanner sc = new Scanner(nombreArchivo);
		Alumno alumno = new Alumno();
		Expediente expediente = new Expediente();
		List<Expediente> exp = new ArrayList<Expediente>();
		Matricula mat = new Matricula();
		List<Matricula> matriculas = new ArrayList<Matricula>();
		while(sc.hasNextLine()) {
			String aux = sc.nextLine();
			Scanner sc2 = new Scanner(aux);
			sc2.useDelimiter(";");
			while(sc2.hasNext()) {
				alumno.setDNI(sc.nextInt());
				nombreCompleto = sc.next() + sc.next() + sc.next();
				alumno.setNombreCompleto(nombreCompleto);
				expediente.setNumExpediente(sc.nextInt());
				mat.setNumeroArchivos(sc.nextInt());
				alumno.setEmailInstitucional(sc.next());
				alumno.setEmailPersonal(sc.next());
				alumno.setTelefono(sc.nextInt());
				alumno.setMovil(sc.nextInt());
				alumno.setDireccionNotificacion(sc.next());
				alumno.setLocalidadNotificacion(sc.next());
				alumno.setProvinciaNotificacion(sc.next());
				alumno.setCpNotificacion(sc.nextInt());
				mat.setFechaMatricula(sc.next());
				mat.setTurnoPreferencia(sc.next());
				mat.setGrupos(sc.next());
				mat.setCursoAcademico("Primero");
				mat.setEstado("Activo");
				mat.setNuevoIngreso(true);
				mat.setListaAsignaturas("Asignaturas primero");
				expediente.setNotaMediaProvisional(sc.nextDouble());
				expediente.setCreditosSuperados(sc.nextInt());
				expediente.setCreditosFB(sc.nextInt());
				expediente.setCreditosOB(sc.nextInt());
				expediente.setCreditosOP(sc.nextInt());
				expediente.setCreditosCF(sc.nextInt());
				expediente.setCreditosPE(sc.nextInt());
				expediente.setCreditosTF(sc.nextInt());

				matriculas.add(mat);
				expediente.setMatriculas(matriculas);
				exp.add(expediente);
				alumno.setExpedientes(exp);
				em.persist(alumno);
				sc2.close();
				sc.close();
			}
		}
	}
}
