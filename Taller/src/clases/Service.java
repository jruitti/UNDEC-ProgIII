package clases;

import java.time.LocalDate;

public class Service {

	private int idService;
	private Vehiculo elVehiculo;
	private Cliente elCliente;
	private LocalDate fecha;
	private String detalle;
	private float precio;

	private Service(int idService, Vehiculo elVehiculo, Cliente elCliente, LocalDate fecha, String detalle,
			float precio) {
		this.idService = idService;
		this.elVehiculo = elVehiculo;
		this.elCliente = elCliente;
		this.fecha = fecha;
		this.detalle = detalle;
		this.precio = precio;
	}

	public static Service instancia(int idService, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService,
			String detalleService, float precio) {
		if (elVehiculo != null) {
			return new Service(idService, elVehiculo, elCliente, fechaService, detalleService, precio);
		}
		return null;

	}

	public String mostrarResumen() {
		// TODO Auto-generated method stub
		//Service Nro: 1\nCliente: Lopez, Juan Manuel - 3825405060\nVehiculo: VW Golf modelo 2009 - Patente ABC123\nTrabajo Realizado: Cambio de Aceite y Filtro\nTotal: $ 1500,00
		String resumen="Service Nro: "+this.idService+"\nCliente: "+this.elCliente.mostrarCliente()+"\nVehiculo: "+this.elVehiculo.mostrarVehiculo()+"\nTrabajo Realizado: "+this.detalle+"\nTotal: $ "+this.precio;
		return resumen;
	}

}
