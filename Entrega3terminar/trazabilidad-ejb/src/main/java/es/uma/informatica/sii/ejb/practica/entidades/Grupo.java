package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grupo
 *
 */
@Entity

public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;  
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;
	private String curso;
	private String letra;
	private String turno;
	private Boolean ingles;
	private Boolean visible;
	private String asignar;
	private Integer plazas;
	
	@ManyToOne
	private Titulacion titulacion;
	@OneToMany(mappedBy = "grupo")
	private List<GruposPorAsignatura> gruposPorAsignatura;
	@OneToMany(mappedBy = "grupo")
	private List<Grupo> grupos;
	@ManyToOne
	private Grupo grupo;
	@OneToMany(mappedBy = "grupo")
	private List<Clase> clases;
	@OneToMany
	private List<Asignaturas_Matricula> asignaturasPorMatricula;
	
	

	public Grupo() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}   
	public String getLetra() {
		return this.letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}   
	public String getTurno() {
		return this.turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}   
	public Boolean getIngles() {
		return this.ingles;
	}

	public void setIngles(Boolean ingles) {
		this.ingles = ingles;
	}   
	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}   
	public String getAsignar() {
		return this.asignar;
	}

	public void setAsignar(String asignar) {
		this.asignar = asignar;
	}   
	public Integer getPlazas() {
		return this.plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Grupo other = (Grupo) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Grupo [Id=" + Id + ", curso=" + curso + ", letra=" + letra + ", turno=" + turno + ", ingles=" + ingles
				+ ", visible=" + visible + ", asignar=" + asignar + ", plazas=" + plazas + "]";
	}
   
}
