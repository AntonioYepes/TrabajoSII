package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import javax.persistence.*;

import es.uma.informatica.sii.ejb.practica.entidades.Matricula.MatriculaId;

/**
 * Entity implementation class for Entity: Asignaturas_Matricula
 *
 */


@Entity @IdClass(Asignaturas_Matricula.Asignaturas_MatriculaId.class)
public class Asignaturas_Matricula implements Serializable {
	
		public static class Asignaturas_MatriculaId {
			private Integer asignatura;
			private MatriculaId matricula;
		}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	private Asignatura asignatura;
	@Id
	@ManyToOne
	private Matricula matricula;
	@ManyToOne
	private Grupo grupo;
	
	
	public Asignaturas_Matricula() {
		super();
	}
   
}
