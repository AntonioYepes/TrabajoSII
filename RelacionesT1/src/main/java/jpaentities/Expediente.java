package jpaentities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Expediente
 *
 */

@Entity
public class Expediente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer numExpediente;
	private Boolean activo;
	private Double notaMediaProvisional;
	private Integer creditosSuperados;
	private Integer creditosFB;
	private Integer creditosOB;
	private Integer creditosOP;
	private Integer creditosCF;
	private Integer creditosPE;
	private Integer creditosTF;
	//done
	@ManyToOne
	private Titulacion titulacion;
	//done
	@ManyToOne
	private Alumno alumno;
	//done
	@OneToMany(mappedBy = "expediente")
	private List<Encuesta> encuestas;
	//done
	@OneToMany(mappedBy = "expediente")
	private List<Matricula> matriculas;
	
	public Expediente() {
		super();
	}

	public Integer getNumExpediente() {
		return numExpediente;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getNotaMediaProvisional() {
		return notaMediaProvisional;
	}

	public void setNotaMediaProvisional(double notaMediaProvisional) {
		this.notaMediaProvisional = notaMediaProvisional;
	}

	public Integer getCreditosSuperados() {
		return creditosSuperados;
	}

	public void setCreditosSuperados(Integer creditosSuperados) {
		this.creditosSuperados = creditosSuperados;
	}

	public Integer getCreditosFB() {
		return creditosFB;
	}

	public void setCreditosFB(Integer creditosFB) {
		this.creditosFB = creditosFB;
	}

	public Integer getCreditosOB() {
		return creditosOB;
	}

	public void setCreditosOB(Integer creditosOB) {
		this.creditosOB = creditosOB;
	}

	public Integer getCreditosOP() {
		return creditosOP;
	}

	public void setCreditosOP(Integer creditosOP) {
		this.creditosOP = creditosOP;
	}

	public Integer getCreditosCF() {
		return creditosCF;
	}

	public void setCreditosCF(Integer creditosCF) {
		this.creditosCF = creditosCF;
	}

	public Integer getCreditosPE() {
		return creditosPE;
	}

	public void setCreditosPE(Integer creditosPE) {
		this.creditosPE = creditosPE;
	}

	public Integer getCreditosTF() {
		return creditosTF;
	}

	public void setCreditosTF(Integer creditosTF) {
		this.creditosTF = creditosTF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numExpediente;
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
		Expediente other = (Expediente) obj;
		if (numExpediente != other.numExpediente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Expediente [numExpediente=" + numExpediente + ", activo=" + activo + ", notaMediaProvisional="
				+ notaMediaProvisional + ", creditosSuperados=" + creditosSuperados + ", creditosFB=" + creditosFB
				+ ", creditosOB=" + creditosOB + ", creditosOP=" + creditosOP + ", creditosCF=" + creditosCF
				+ ", creditosPE=" + creditosPE + ", creditosTF=" + creditosTF + "]";
	}
   
	
}
