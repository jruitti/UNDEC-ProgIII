package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:10.936-0300")
@StaticMetamodel(Domicilio.class)
public class Domicilio_ {
	public static volatile SingularAttribute<Domicilio, Long> idDomicilio;
	public static volatile SingularAttribute<Domicilio, String> calle;
	public static volatile SingularAttribute<Domicilio, Integer> numero;
	public static volatile SingularAttribute<Domicilio, Integer> piso;
	public static volatile SingularAttribute<Domicilio, String> departamento;
	public static volatile SingularAttribute<Domicilio, Localidad> localidad;
}
