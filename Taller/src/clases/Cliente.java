package clases;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private int idCliente;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String telefono;
	
	private Collection<Vehiculo> vehiculos;
	
	private Cliente(int idCliente, String apellido, String nombres, String documento, LocalDate fechaNacimiento,
			String domicilio, String telefono) {
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.vehiculos=new LinkedList<>();
	}



	public static Cliente instancia(int idCliente, String apellido, String nombres, String documento, LocalDate fechaNacimiento, String domicilio,
			String telefono) {
		if(documento!=null) {
			return new Cliente(idCliente, apellido, nombres, documento, fechaNacimiento, domicilio, telefono);
		}
		return null;
	}



	public String mostrarCliente() {
		return this.apellido+", "+this.nombres+" - "+this.telefono;
	}



	public void asignarVehiculo(Vehiculo elVehiculo) {
		this.vehiculos.add(elVehiculo);
		
	}



	public LinkedList<Vehiculo> devolverVehiculos() {
		return (LinkedList<Vehiculo>) this.vehiculos;
	}

}
