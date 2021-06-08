package jpaentities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: GruposPorAsignatura
 *
 */

@Entity 
public class GruposPorAsignatura implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer cursoAcademico;
	private Boolean oferta;
	//done
	@ManyToOne
	@JoinColumn(name= "referencia")
	private Asignatura asignatura;
	//done
	@ManyToOne
	@JoinColumn (name ="Id")
	private Grupo grupo;
	//done
	@ManyToMany (mappedBy = "gpas")
	private List<Encuesta> encuestas;
	
	
	public GruposPorAsignatura() {
		super();
	}
	
	public boolean isOferta() {
		return oferta;
	}


	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}


	public int getCursoAcademico() {
		return cursoAcademico;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cursoAcademico;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GruposPorAsignatura other = (GruposPorAsignatura) obj;
		if (cursoAcademico != other.cursoAcademico)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GruposPorAsignatura [cursoAcademico=" + cursoAcademico + ", oferta=" + oferta + "]";
	}
   
}
