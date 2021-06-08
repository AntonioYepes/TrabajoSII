package jpaentities;

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
	private Integer Id;
	private String nombre;
	private String direccion;
	private Integer telefonoConsejeria;
	//done
	@ManyToMany
	@JoinTable(name = "centro_titu", 
	joinColumns = @JoinColumn(name = "Id"),
	inverseJoinColumns =  @JoinColumn(name= "codigo"))
	private List<Titulacion> titulaciones;
	
	public Centro() {
		super();
	}
	
	public Integer getId () {
		return Id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
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
		if (Id != other.Id)
			return false;
		return true;
	}
   
	@Override
	public String toString() {
		return "Centro [ID=" + Id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefonoConsejeria="
				+ telefonoConsejeria + "]";
	}
	
}
