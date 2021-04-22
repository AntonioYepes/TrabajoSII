package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.345-0700")
@StaticMetamodel(Matricula.class)
public class Matricula_ {
	public static volatile SingularAttribute<Matricula, String> CursoAcademico;
	public static volatile SingularAttribute<Matricula, String> Estado;
	public static volatile SingularAttribute<Matricula, Integer> NumeroArchivos;
	public static volatile SingularAttribute<Matricula, String> TurnoPreferencia;
	public static volatile SingularAttribute<Matricula, String> FechaMatricula;
	public static volatile SingularAttribute<Matricula, Boolean> NuevoIngreso;
	public static volatile SingularAttribute<Matricula, String> ListaAsignaturas;
	public static volatile SingularAttribute<Matricula, Expediente> expediente;
	public static volatile ListAttribute<Matricula, Asignaturas_Matricula> asignaturasPorMatricula;
}
