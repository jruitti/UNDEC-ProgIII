package aeropuertoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import aeropuertoInteractors.PilotsInteractor;
import clases.Piloto;
import clases.Vuelo;

class VueloTest {

	@Test
	public void FlightHoursPilot_RequestSum_ReturnSum() {

		final Piloto aPilot = makeAPilot();
		final LinkedList<Piloto> crew = new LinkedList<Piloto>();
		crew.add(aPilot);
		final Vuelo aFlight = new Vuelo("", null, LocalDateTime.of(2018, 04, 10, 21, 10), null,
				LocalDateTime.of(2018, 04, 10, 22, 45), null, crew, null, null);
		final Vuelo otherFlight = new Vuelo("", null, LocalDateTime.of(2018, 04, 10, 00, 00), null,
				LocalDateTime.of(2018, 04, 10, 12, 00), null, crew, null, null);

		final int hours = PilotsInteractor.getFlightHours(aPilot);

		assertEquals(13, hours);
	}

	@Test
	public void FlightHoursPilot_NoFlights_ReturnZero() {

		final Piloto aPilot = makeAPilot();
		final Integer hours = PilotsInteractor.getFlightHours(aPilot);
	}

	private Piloto makeAPilot() {
		return new Piloto(1, "Perez", "Juan Antonio", "07071970", LocalDate.of(1984, 1, 31));
	}

}
