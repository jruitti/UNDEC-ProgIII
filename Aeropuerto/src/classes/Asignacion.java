package classes;

public class Asignacion {

	private final String codigoAsignacion;
	private final Pasajero pasajero;
	private final Asiento asiento;

	public Asignacion(String codigoAsignacion, Pasajero pasajero, Asiento asiento) {
		this.codigoAsignacion = codigoAsignacion;
		this.pasajero = pasajero;
		this.asiento = asiento;
	}

}
