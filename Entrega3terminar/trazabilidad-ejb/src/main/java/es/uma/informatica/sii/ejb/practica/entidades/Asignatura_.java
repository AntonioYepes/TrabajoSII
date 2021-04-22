package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.321-0700")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ {
	public static volatile SingularAttribute<Asignatura, Integer> referencia;
	public static volatile SingularAttribute<Asignatura, Integer> codigo;
	public static volatile SingularAttribute<Asignatura, Integer> creditos;
	public static volatile SingularAttribute<Asignatura, Boolean> ofertada;
	public static volatile SingularAttribute<Asignatura, String> nombre;
	public static volatile SingularAttribute<Asignatura, Integer> curso;
	public static volatile SingularAttribute<Asignatura, String> caracter;
	public static volatile SingularAttribute<Asignatura, String> duracion;
	public static volatile SingularAttribute<Asignatura, String> unidadTemporal;
	public static volatile SingularAttribute<Asignatura, String> idiomasDeImparticion;
	public static volatile SingularAttribute<Asignatura, Titulacion> titulacion;
	public static volatile ListAttribute<Asignatura, GruposPorAsignatura> grupos;
	public static volatile ListAttribute<Asignatura, Clase> clases;
	public static volatile ListAttribute<Asignatura, Asignaturas_Matricula> asignaturasPorMatricula;
}
