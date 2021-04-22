	package es.uma.informatica.sii.ejb.practica.entidades;
	 
	import java.io.Serializable;
	import java.lang.Boolean;
	import java.lang.Integer;
	import java.lang.String;
import java.util.List;

import javax.persistence.*;
	 
	/**
	* Entity implementation class for Entity: Matricula
	*
	*/
@Entity @IdClass(Matricula.MatriculaId.class)
public class Matricula implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static class MatriculaId implements Serializable {
		private Integer expediente;
		private String CursoAcademico;
	}
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String CursoAcademico;
	private String Estado;
	private Integer NumeroArchivos;
	private String TurnoPreferencia;
	private String FechaMatricula;
	private Boolean NuevoIngreso;
	private String ListaAsignaturas;
	@Id
	@ManyToOne
	private Expediente expediente;
	@OneToMany
	private List<Asignaturas_Matricula> asignaturasPorMatricula;
	
	public Matricula() {
		super();
	}
	 
	 
	@Override
	public String toString() {
		return "Matricula [CursoAcademico=" + CursoAcademico + ", Estado=" + Estado + ", NumeroArchivos="
				+ NumeroArchivos + ", TurnoPreferencia=" + TurnoPreferencia + ", FechaMatricula=" + FechaMatricula
				+ ", NuevoIngreso=" + NuevoIngreso + ", ListaAsignaturas=" + ListaAsignaturas + "]";
	}
	 
	 
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((CursoAcademico == null) ? 0 : CursoAcademico.hashCode());
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
		Matricula other = (Matricula) obj;
		if (CursoAcademico == null) {
			if (other.CursoAcademico != null)
				return false;
		} else if (!CursoAcademico.equals(other.CursoAcademico))
			return false;
			return true;
		}
	 
	 
		public String getCursoAcademico() {
			return this.CursoAcademico;
		}
	 
		public void setCursoAcademico(String CursoAcademico) {
			this.CursoAcademico = CursoAcademico;
		}
		public String getEstado() {
			return this.Estado;
		}
	 
		public void setEstado(String Estado) {
			this.Estado = Estado;
		}
	
		public Integer getNumeroArchivos() {
			return this.NumeroArchivos;
		}
	 
		public void setNumeroArchivos(Integer NumeroArchivos) {
			this.NumeroArchivos = NumeroArchivos;
		}
	
		public String getTurnoPreferencia() {
			return this.TurnoPreferencia;
		}
	 
		public void setTurnoPreferencia(String TurnoPreferencia) {
			this.TurnoPreferencia = TurnoPreferencia;
		}
	
		public String getFechaMatricula() {
			return this.FechaMatricula;
		}
	 
		public void setFechaMatricula(String FechaMatricula) {
			this.FechaMatricula = FechaMatricula;
		}
	
		public Boolean getNuevoIngreso() {
			return this.NuevoIngreso;
		}
	 
		public void setNuevoIngreso(Boolean NuevoIngreso) {
			this.NuevoIngreso = NuevoIngreso;
		}
	
		public String getListaAsignaturas() {
			return this.ListaAsignaturas;
		}
	 
		public void setListaAsignaturas(String ListaAsignaturas) {
			this.ListaAsignaturas = ListaAsignaturas;
		}
	 
	}
 
