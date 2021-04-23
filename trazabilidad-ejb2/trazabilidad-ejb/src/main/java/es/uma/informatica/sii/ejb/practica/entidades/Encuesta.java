package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Encuesta
 *
 */
@Entity @IdClass(Encuesta.EncuestaId.class)
public class Encuesta implements Serializable {
	
	
	public static class EncuestaId implements Serializable{
		private Integer fechaEnvio;
		private Integer expediente;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((expediente == null) ? 0 : expediente.hashCode());
			result = prime * result + ((fechaEnvio == null) ? 0 : fechaEnvio.hashCode());
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
			EncuestaId other = (EncuestaId) obj;
			if (expediente == null) {
				if (other.expediente != null)
					return false;
			} else if (!expediente.equals(other.expediente))
				return false;
			if (fechaEnvio == null) {
				if (other.fechaEnvio != null)
					return false;
			} else if (!fechaEnvio.equals(other.fechaEnvio))
				return false;
			return true;
		}
		
		
	}
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	//@Column(name = "fechaEnvio")
	private Integer fechaEnvio;
	@ManyToMany
	@JoinTable(
		    name = "jnd_enc_gpa", 
		    joinColumns = {
		        @JoinColumn(name = "encuesta_fenvio", referencedColumnName = "fechaEnvio"),
		        @JoinColumn(name = "encuesta_exp", referencedColumnName = "expediente")},
		    inverseJoinColumns = { 
		        @JoinColumn(name = "gpa_grupo", referencedColumnName = "grupo"),
		        @JoinColumn(name = "gpa_asignatura", referencedColumnName = "asignatura"),
		        @JoinColumn(name = "gpa_cursoAcad", referencedColumnName = "cursoAcademico")
		        })
	private List<GruposPorAsignatura> grupos;
	
	@Id
	@ManyToOne
	//@Column(name = "expediente")
	private Expediente expediente;
	
	public Encuesta() {
		super();
	}

	public int getFechaEnvio() {
		return fechaEnvio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fechaEnvio;
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
		Encuesta other = (Encuesta) obj;
		if (fechaEnvio != other.fechaEnvio)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Encuesta [fechaEnvio=" + fechaEnvio + "]";
	}

}
