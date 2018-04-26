package aeropuertoInteractors;

import java.util.Collection;
import java.util.LinkedList;

import clases.Piloto;
import clases.Vuelo;

public class FlightsInteractor {

	public static Integer getPilotFligthHours(Piloto piloto) {

		final Collection<Vuelo> allFlights = new LinkedList<Vuelo>();

		Long horas = 0L;
		for (final Vuelo theFlight : allFlights) {
			horas += theFlight.getDurationInHours();
		}

		return horas.intValue();
	}

}
