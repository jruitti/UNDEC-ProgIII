package modelo;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:11.091-0300")
@StaticMetamodel(VacunaColocada.class)
public class VacunaColocada_ {
	public static volatile SingularAttribute<VacunaColocada, Long> idVacunaColocada;
	public static volatile SingularAttribute<VacunaColocada, LocalDate> fechaColocacion;
	public static volatile SingularAttribute<VacunaColocada, Enfermedad> enfermedad;
}
