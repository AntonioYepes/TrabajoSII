package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.355-0700")
@StaticMetamodel(Titulacion.class)
public class Titulacion_ {
	public static volatile SingularAttribute<Titulacion, Integer> codigo;
	public static volatile SingularAttribute<Titulacion, String> nombre;
	public static volatile SingularAttribute<Titulacion, Integer> creditos;
	public static volatile ListAttribute<Titulacion, Centro> centros;
	public static volatile ListAttribute<Titulacion, Grupo> grupos;
	public static volatile ListAttribute<Titulacion, Expediente> expedientes;
	public static volatile ListAttribute<Titulacion, Asignatura> asignaturas;
}
