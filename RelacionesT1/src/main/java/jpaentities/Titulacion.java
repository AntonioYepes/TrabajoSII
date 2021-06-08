package jpaentities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Titulacion
 *
 */

@Entity
public class Titulacion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer codigo;
	private String nombre;
	private Integer creditos;
	//done
	@ManyToMany(mappedBy = "titulaciones")
	private List<Centro> centros;
	//done
	@OneToMany(mappedBy = "titulacion")
	private List<Grupo> grupos;
	//done
	@OneToMany(mappedBy = "titulacion")
	private List<Expediente> expedientes;
	//done
	@OneToMany(mappedBy = "titulacion")
	private List<Asignatura> asignaturas;
	
	public Titulacion() {
		super();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Titulacion other = (Titulacion) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Titulacion [codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + "]";
	}
   
}
