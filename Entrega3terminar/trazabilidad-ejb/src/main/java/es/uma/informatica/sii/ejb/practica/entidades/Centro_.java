package es.uma.informatica.sii.ejb.practica.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-04-08T13:47:19.323-0700")
@StaticMetamodel(Centro.class)
public class Centro_ {
	public static volatile SingularAttribute<Centro, Integer> ID;
	public static volatile SingularAttribute<Centro, String> nombre;
	public static volatile SingularAttribute<Centro, String> direccion;
	public static volatile SingularAttribute<Centro, Integer> telefonoConsejeria;
	public static volatile ListAttribute<Centro, Titulacion> titulaciones;
}
