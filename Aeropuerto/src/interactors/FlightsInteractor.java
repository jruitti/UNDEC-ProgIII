package interactors;

import java.util.Collection;
import java.util.LinkedList;

import classes.Piloto;
import classes.Vuelo;

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
