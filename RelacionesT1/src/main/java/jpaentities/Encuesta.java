package jpaentities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Encuesta
 *
 */
@Entity 
public class Encuesta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer fechaEnvio;

	//done
	@ManyToOne
	@JoinColumn(name="numExpediente")
	private Expediente expediente;
	
	//done
	@ManyToMany
	@JoinTable(name="enc_gpa", joinColumns =
		@JoinColumn(name = "fechaEnvio"),
		inverseJoinColumns = @JoinColumn(name="cursoAcademico"))
	private List<GruposPorAsignatura> gpas;
	
	
	
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

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public void setFechaEnvio(Integer fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	

}
