package es.uma.informatica.sii.ejb.practica.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Optativa
 *
 */
@Entity 
@DiscriminatorValue("S")
public class Optativa extends Asignatura implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private Integer plazas;
	private String mencion;
	

	public Optativa() {
		super();
	}   
	public Integer getPlazas() {
		return this.plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}   
	public String getMencion() {
		return this.mencion;
	}

	public void setMencion(String mencion) {
		this.mencion = mencion;
	}
   
}
