package clases;

public class Vehiculo {

	private int idVehiculo;
	private String marcaModelo;
	private String patente;
	private int anio;

	private Vehiculo(int idVehiculo, String marcaModelo, String patente, int anio) {
		super();
		this.idVehiculo = idVehiculo;
		this.marcaModelo = marcaModelo;
		this.patente = patente;
		this.anio = anio;
	}

	public static Vehiculo instancia(int idVehiculo, String marcaModelo, String patente, int anio) {
		if (patente != null)
			return new Vehiculo(idVehiculo, marcaModelo, patente, anio);
		return null;
	}

	public String mostrarVehiculo() {
		// TODO Auto-generated method stub
		return this.marcaModelo+" modelo "+this.anio+" - Patente "+this.patente;
	}

}
