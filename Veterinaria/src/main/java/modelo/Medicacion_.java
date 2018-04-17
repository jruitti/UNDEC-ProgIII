package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:10.977-0300")
@StaticMetamodel(Medicacion.class)
public class Medicacion_ {
	public static volatile SingularAttribute<Medicacion, Long> idMedicacion;
	public static volatile SingularAttribute<Medicacion, String> dosis;
	public static volatile SingularAttribute<Medicacion, Integer> intervalo;
	public static volatile SingularAttribute<Medicacion, String> periodo;
	public static volatile SingularAttribute<Medicacion, Medicamento> medicamento;
}
