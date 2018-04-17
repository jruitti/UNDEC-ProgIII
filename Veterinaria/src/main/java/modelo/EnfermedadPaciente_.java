package modelo;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-08T01:27:10.951-0300")
@StaticMetamodel(EnfermedadPaciente.class)
public class EnfermedadPaciente_ {
	public static volatile SingularAttribute<EnfermedadPaciente, Long> idEnfermedadPaciente;
	public static volatile SingularAttribute<EnfermedadPaciente, LocalDate> fechaEnfermedad;
	public static volatile ListAttribute<EnfermedadPaciente, Medicacion> medicacion;
	public static volatile SingularAttribute<EnfermedadPaciente, Enfermedad> enfermedad;
}
