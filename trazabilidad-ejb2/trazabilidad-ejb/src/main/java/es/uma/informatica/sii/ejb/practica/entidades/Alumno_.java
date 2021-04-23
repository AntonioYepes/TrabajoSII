package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.136-0700")
@StaticMetamodel(Alumno.class)
public class Alumno_ {
	public static volatile SingularAttribute<Alumno, Integer> ID;
	public static volatile SingularAttribute<Alumno, Integer> DNI;
	public static volatile SingularAttribute<Alumno, String> nombreCompleto;
	public static volatile SingularAttribute<Alumno, String> emailInstitucional;
	public static volatile SingularAttribute<Alumno, String> emailPersonal;
	public static volatile SingularAttribute<Alumno, Integer> telefono;
	public static volatile SingularAttribute<Alumno, Integer> movil;
	public static volatile SingularAttribute<Alumno, String> direccionNotificacion;
	public static volatile SingularAttribute<Alumno, String> localidadNotificacion;
	public static volatile SingularAttribute<Alumno, String> provinciaNotificacion;
	public static volatile SingularAttribute<Alumno, Integer> cpNotificacion;
	public static volatile ListAttribute<Alumno, Expediente> expedientes;
}
