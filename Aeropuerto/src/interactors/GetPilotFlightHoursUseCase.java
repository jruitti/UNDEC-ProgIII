package interactors;

import java.util.Collection;

import classes.Piloto;
import classes.Vuelo;
import repository.FlightRepository;

public class GetPilotFlightHoursUseCase {

	private final FlightRepository flightRepository;

	public GetPilotFlightHoursUseCase(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	public int getPilotFlighHours(Piloto aPilot) {
		Collection<Vuelo> pilotFlights = flightRepository.getFlights(aPilot);
		int flightHours = 0;
		for (Vuelo vuelo : pilotFlights) {
			flightHours += vuelo.getDurationInMinutes();
		}

		return flightHours / 60;
	}

}
