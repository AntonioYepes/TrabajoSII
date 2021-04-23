package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.323-0700")
@StaticMetamodel(Clase.class)
public class Clase_ {
	public static volatile SingularAttribute<Clase, String> dia;
	public static volatile SingularAttribute<Clase, String> horaInicio;
	public static volatile SingularAttribute<Clase, String> horaFin;
	public static volatile SingularAttribute<Clase, Asignatura> asignatura;
	public static volatile SingularAttribute<Clase, Grupo> grupo;
}
