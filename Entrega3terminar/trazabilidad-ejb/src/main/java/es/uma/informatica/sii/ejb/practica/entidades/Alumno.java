package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alumno
 *
 */

@Entity
public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer ID;
	private Integer DNI;
	private String nombreCompleto;
	private String emailInstitucional;
	private String emailPersonal;
	private Integer telefono;
	private Integer movil;
	private String direccionNotificacion;
	private String localidadNotificacion;
	private String provinciaNotificacion;
	private Integer cpNotificacion;
	@OneToMany(mappedBy= "alumno")
	private List<Expediente> expedientes;
	
	public Alumno() {
		super();
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmailInstitucional() {
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}

	public String getEmailPersonal() {
		return emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getMovil() {
		return movil;
	}

	public void setMovil(Integer movil) {
		this.movil = movil;
	}

	public String getDireccionNotificacion() {
		return direccionNotificacion;
	}

	public void setDireccionNotificacion(String direccionNotificacion) {
		this.direccionNotificacion = direccionNotificacion;
	}

	public String getLocalidadNotificacion() {
		return localidadNotificacion;
	}

	public void setLocalidadNotificacion(String localidadNotificacion) {
		this.localidadNotificacion = localidadNotificacion;
	}

	public String getProvinciaNotificacion() {
		return provinciaNotificacion;
	}

	public void setProvinciaNotificacion(String provinciaNotificacion) {
		this.provinciaNotificacion = provinciaNotificacion;
	}

	public Integer getCpNotificacion() {
		return cpNotificacion;
	}

	public void setCpNotificacion(Integer cpNotificacion) {
		this.cpNotificacion = cpNotificacion;
	}

	@Override
	public String toString() {
		return "Alumno [ID=" + ID + ", DNI=" + DNI + ", nombreCompleto=" + nombreCompleto + ", emailInstitucional="
				+ emailInstitucional + ", emailPersonal=" + emailPersonal + ", telefono=" + telefono + ", movil="
				+ movil + ", direccionNotificacion=" + direccionNotificacion + ", localidadNotificacion="
				+ localidadNotificacion + ", provinciaNotificacion=" + provinciaNotificacion + ", cpNotificacion="
				+ cpNotificacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
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
		Alumno other = (Alumno) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	

	
   
}
