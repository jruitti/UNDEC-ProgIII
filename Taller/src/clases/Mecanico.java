package clases;

import java.time.LocalDate;

public class Mecanico {

	private int idMecanico;
	private String apellido;
	private String nombres;
	private String matricula;
	private LocalDate fechaNacimiento;
	private String domicilio;

	private Mecanico(int idMecanico, String apellido, String nombres, String matricula, LocalDate fechaNacimiento,
			String domicilio) {
		this.idMecanico = idMecanico;
		this.apellido = apellido;
		this.nombres = nombres;
		this.matricula = matricula;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
	}

	public static Mecanico instancia(int idMecanico, String apellido, String nombres, String matricula,
			LocalDate fechaNacimiento, String domicilio) {
		if (matricula != null) {
			return new Mecanico(idMecanico, apellido, nombres, matricula, fechaNacimiento, domicilio);
		}
		return null;
	}

	public String mostrarMecanico() {
		return this.apellido+", "+this.nombres+" ("+this.matricula+")";
	}

}
