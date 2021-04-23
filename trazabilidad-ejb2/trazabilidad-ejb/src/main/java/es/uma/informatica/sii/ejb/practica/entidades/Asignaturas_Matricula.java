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
	
		public static class Asignaturas_MatriculaId implements Serializable {
			private Integer asignatura;
			private MatriculaId matricula;
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
				result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
				Asignaturas_MatriculaId other = (Asignaturas_MatriculaId) obj;
				if (asignatura == null) {
					if (other.asignatura != null)
						return false;
				} else if (!asignatura.equals(other.asignatura))
					return false;
				if (matricula == null) {
					if (other.matricula != null)
						return false;
				} else if (!matricula.equals(other.matricula))
					return false;
				return true;
			}
			
			
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
