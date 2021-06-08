package jpaentities;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implemetation class for Entity: Asignatura
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISC", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("N")
public class Asignatura implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer referencia;
	private Integer codigo;
	private Integer creditos;
	private Boolean ofertada;
	private String nombre;
	private Integer curso;
	private String caracter;
	private String duracion;
	private String unidadTemporal;
	private String idiomasDeImparticion;
	//done
	@ManyToOne
	private Titulacion titulacion;
	//done
	@OneToMany(mappedBy = "asignatura")
	private List<GruposPorAsignatura> gpa;
	//done
	@OneToMany(mappedBy = "asignatura")
	private List<Clase> clases; //Id de clase es compuesta
	//done
	@OneToMany (mappedBy = "asignatura")
	private List<Asignaturas_Matricula> asignaturasMatricula;

	public Asignatura() {
		super();
	}   
	public Integer getReferencia() {
		return this.referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}   
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}   
	public Integer getCreditos() {
		return this.creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}   
	public Boolean getOfertada() {
		return this.ofertada;
	}

	public void setOfertada(Boolean ofertada) {
		this.ofertada = ofertada;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public Integer getCurso() {
		return this.curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}   
	public String getCaracter() {
		return this.caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}   
	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}   
	public String getUnidadTemporal() {
		return this.unidadTemporal;
	}

	public void setUnidadTemporal(String unidadTemporal) {
		this.unidadTemporal = unidadTemporal;
	}   
	public String getIdiomasDeImparticion() {
		return this.idiomasDeImparticion;
	}

	public void setIdiomasDeImparticion(String idiomasDeImparticion) {
		this.idiomasDeImparticion = idiomasDeImparticion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((referencia == null) ? 0 : referencia.hashCode());
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
		Asignatura other = (Asignatura) obj;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Asignatura [referencia=" + referencia + ", codigo=" + codigo + ", creditos=" + creditos + ", ofertada="
				+ ofertada + ", nombre=" + nombre + ", curso=" + curso + ", caracter=" + caracter + ", duracion="
				+ duracion + ", unidadTemporal=" + unidadTemporal + ", idiomasDeImparticion=" + idiomasDeImparticion
				+ "]";
	}
   
}
