package modelo;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-10-30T20:46:08.189-0300")
@StaticMetamodel(Paciente.class)
public class Paciente_ {
	public static volatile SingularAttribute<Paciente, Long> idPaciente;
	public static volatile SingularAttribute<Paciente, String> alias;
	public static volatile SingularAttribute<Paciente, Raza> raza;
	public static volatile SingularAttribute<Paciente, String> colorPelo;
	public static volatile SingularAttribute<Paciente, LocalDate> fechaNacimiento;
	public static volatile SingularAttribute<Paciente, Cliente> duenio;
	public static volatile SingularAttribute<Paciente, Float> pesoActual;
	public static volatile ListAttribute<Paciente, Visita> visitas;
	public static volatile ListAttribute<Paciente, VacunaColocada> vacunas;
	public static volatile ListAttribute<Paciente, EnfermedadPaciente> enfermedades;
}
