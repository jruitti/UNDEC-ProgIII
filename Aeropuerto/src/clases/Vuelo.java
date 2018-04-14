package clases;

import java.time.LocalDate;
import java.util.Collection;

public class Vuelo {

	private final String codigoVuelo;
	private final Aeropuerto salida;
	private final LocalDate fechaHoraSalida;
	private final Aeropuerto arribo;
	private final LocalDate fechaHoraArribo;
	private final Aerolinea aerolinea;
	private final Collection<Piloto> pilotos;
	private final Avion avion;
	private final Collection<Pasajero> pasajeros;

	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDate fechaHoraSalida, Aeropuerto arribo,
			LocalDate fechaHoraArribo, Aerolinea aerolinea, Collection<Piloto> pilotos, Avion avion,
			Collection<Pasajero> pasajeros) {
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}

}
