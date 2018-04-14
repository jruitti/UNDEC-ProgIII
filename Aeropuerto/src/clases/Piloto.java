package clases;

import java.time.LocalDate;
import java.time.Period;

public class Piloto {

	private final Integer idPiloto;
	private final String apellido;
	private final String nombres;
	private final String documento;
	private final LocalDate fechaNacimiento;

	public Piloto(Integer idPiloto, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getAge(LocalDate actualDate) {

		return Period.between(fechaNacimiento, actualDate).getYears();

	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getSurnameAndName() {
		return this.apellido + ", " + this.nombres;
	}

}
