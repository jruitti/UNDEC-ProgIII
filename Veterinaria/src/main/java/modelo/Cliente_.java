package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:10.743-0300")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Long> idCliente;
	public static volatile SingularAttribute<Cliente, String> apellidoFamilia;
	public static volatile SingularAttribute<Cliente, Domicilio> domicilio;
	public static volatile SingularAttribute<Cliente, String> nroCuenta;
	public static volatile SingularAttribute<Cliente, String> telefono;
	public static volatile ListAttribute<Cliente, Paciente> mascotas;
}
