package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.331-0700")
@StaticMetamodel(GruposPorAsignatura.class)
public class GruposPorAsignatura_ {
	public static volatile SingularAttribute<GruposPorAsignatura, Integer> cursoAcademico;
	public static volatile SingularAttribute<GruposPorAsignatura, Boolean> oferta;
	public static volatile SingularAttribute<GruposPorAsignatura, Asignatura> asignatura;
	public static volatile SingularAttribute<GruposPorAsignatura, Grupo> grupo;
}
