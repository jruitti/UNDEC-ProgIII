package modelo;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:11.098-0300")
@StaticMetamodel(Visita.class)
public class Visita_ {
	public static volatile SingularAttribute<Visita, Long> idVisita;
	public static volatile SingularAttribute<Visita, LocalDate> fechaVisita;
	public static volatile SingularAttribute<Visita, Float> pesoVisita;
	public static volatile SingularAttribute<Visita, MotivoVisita> motivoVisita;
}
