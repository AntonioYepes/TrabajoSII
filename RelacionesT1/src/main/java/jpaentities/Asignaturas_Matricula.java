package jpaentities;

import java.io.Serializable;
import javax.persistence.*;
/**
 * Entity implementation class for Entity: Asignaturas_Matricula
 *
 */


@Entity
public class Asignaturas_Matricula implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;
	private static final long serialVersionUID = 1L;
	//done
	@ManyToOne
	@JoinColumn(name="referencia")
	private Asignatura asignatura;
	//done
	@ManyToOne
	@JoinColumn(name="CursoAcademico")
	private Matricula matricula;
	//done
	@ManyToOne
	private Grupo grupo;
	
	
	public Asignaturas_Matricula() {
		super();
	}
   
}
