package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.324-0700")
@StaticMetamodel(Expediente.class)
public class Expediente_ {
	public static volatile SingularAttribute<Expediente, Integer> numExpediente;
	public static volatile SingularAttribute<Expediente, Boolean> activo;
	public static volatile SingularAttribute<Expediente, Double> notaMediaProvisional;
	public static volatile SingularAttribute<Expediente, Integer> creditosSuperados;
	public static volatile SingularAttribute<Expediente, Integer> creditosFB;
	public static volatile SingularAttribute<Expediente, Integer> creditosOB;
	public static volatile SingularAttribute<Expediente, Integer> creditosOP;
	public static volatile SingularAttribute<Expediente, Integer> creditosCF;
	public static volatile SingularAttribute<Expediente, Integer> creditosPE;
	public static volatile SingularAttribute<Expediente, Integer> creditosTF;
	public static volatile SingularAttribute<Expediente, Titulacion> titulacion;
	public static volatile SingularAttribute<Expediente, Alumno> alumno;
	public static volatile ListAttribute<Expediente, Encuesta> encuestas;
	public static volatile ListAttribute<Expediente, Matricula> matriculas;
}
