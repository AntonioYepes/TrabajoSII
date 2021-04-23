package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.331-0700")
@StaticMetamodel(Grupo.class)
public class Grupo_ {
	public static volatile SingularAttribute<Grupo, Integer> Id;
	public static volatile SingularAttribute<Grupo, String> curso;
	public static volatile SingularAttribute<Grupo, String> letra;
	public static volatile SingularAttribute<Grupo, String> turno;
	public static volatile SingularAttribute<Grupo, Boolean> ingles;
	public static volatile SingularAttribute<Grupo, Boolean> visible;
	public static volatile SingularAttribute<Grupo, String> asignar;
	public static volatile SingularAttribute<Grupo, Integer> plazas;
	public static volatile SingularAttribute<Grupo, Titulacion> titulacion;
	public static volatile ListAttribute<Grupo, GruposPorAsignatura> gruposPorAsignatura;
	public static volatile ListAttribute<Grupo, Grupo> grupos;
	public static volatile SingularAttribute<Grupo, Grupo> grupo;
	public static volatile ListAttribute<Grupo, Clase> clases;
	public static volatile ListAttribute<Grupo, Asignaturas_Matricula> asignaturasPorMatricula;
}
