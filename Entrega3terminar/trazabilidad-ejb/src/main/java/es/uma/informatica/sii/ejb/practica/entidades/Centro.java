package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Centro
 *
 */

@Entity
public class Centro implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue (strategy= GenerationType.SEQUENCE)
	private Integer ID;
	private String nombre;
	private String direccion;
	private Integer telefonoConsejeria;
	@ManyToMany
	@JoinTable(name = "jnd_ctr_tit", joinColumns = @JoinColumn(name = "centro_fk"),inverseJoinColumns =  @JoinColumn(name= "titulacion_fk"))
	private List<Titulacion> titulaciones;
	
	public Centro() {
		super();
	}
	
	public Integer getID () {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefonoConsejeria() {
		return telefonoConsejeria;
	}

	public void setTelefonoConsejeria(Integer telefonoConsejeria) {
		this.telefonoConsejeria = telefonoConsejeria;
	}
	
	public void setTitulaciones(List<Titulacion> titulaciones) {
		this.titulaciones = titulaciones;
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
		Centro other = (Centro) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
   
	@Override
	public String toString() {
		return "Centro [ID=" + ID + ", nombre=" + nombre + ", direccion=" + direccion + ", telefonoConsejeria="
				+ telefonoConsejeria + "]";
	}
	
}
