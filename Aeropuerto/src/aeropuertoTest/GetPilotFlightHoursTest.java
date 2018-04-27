package aeropuertoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import classes.Piloto;
import classes.Vuelo;
import interactors.GetPilotFlightHoursUseCase;
import repository.FlightRepository;

public class GetPilotFlightHoursTest {

	@Test
	public void FlightHoursPilot_RequestSum_ReturnSum() {

		FakeFlightRepository fakeFlightRepository = new FakeFlightRepository();

		GetPilotFlightHoursUseCase getPilotFlightHoursUseCase = new GetPilotFlightHoursUseCase(fakeFlightRepository);
		Piloto aPilot = new Piloto(1, "Ruitti", "Javier", "30672405", LocalDate.of(1984, 1, 31));

		int pilotFlightHours = getPilotFlightHoursUseCase.getPilotFlighHours(aPilot);

		assertEquals(20, pilotFlightHours);

	}

}

class FakeFlightRepository implements FlightRepository {

	@Override
	public Collection<Vuelo> getFlights(Piloto aPilot) {
		Vuelo flight1 = new Vuelo("", null, LocalDateTime.of(2018, 4, 10, 21, 10), null,
				LocalDateTime.of(2018, 4, 10, 22, 45), null, null, null, null);
		Vuelo flight2 = new Vuelo("", null, LocalDateTime.of(2018, 4, 12, 21, 10), null,
				LocalDateTime.of(2018, 4, 13, 8, 20), null, null, null, null);
		Vuelo flight3 = new Vuelo("", null, LocalDateTime.of(2018, 04, 20, 6, 00), null,
				LocalDateTime.of(2018, 4, 20, 13, 40), null, null, null, null);
		LinkedList<Vuelo> flights = new LinkedList<Vuelo>();
		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		return flights;
	}

}
