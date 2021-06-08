package jpaentities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Solicitud
 *
 */
@Entity

public class Solicitud implements Serializable {

	   
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id_solicitud;
	private String destinatario;
	private String emisor;
	private String asunto;
	private String tipoSolicitud;
	private String fecha;
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private Alumno alumno;
	private static final long serialVersionUID = 1L;

	public Solicitud() {
		super();
	}  
	public String getId_solicitud() {
		return this.id_solicitud;
	}

	public void setId_solicitud(String id_solicitud) {
		this.id_solicitud = id_solicitud;
	}   
	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}   
	public String getEmisor() {
		return this.emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}   
	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}   
	public String getTipoSolicitud() {
		return this.tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}   
	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id_solicitud == null) ? 0 : id_solicitud.hashCode());
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
		Solicitud other = (Solicitud) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id_solicitud == null) {
			if (other.id_solicitud != null)
				return false;
		} else if (!id_solicitud.equals(other.id_solicitud))
			return false;
		return true;
	}
	
   
}
