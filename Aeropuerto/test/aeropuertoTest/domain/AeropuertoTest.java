package aeropuertoTest.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.Aeropuerto;
import classes.Ciudad;

class AeropuertoTest {

	@Test
	void ShowDetails_ReturnsFormatted() {

		Ciudad theCity = new Ciudad(1, "La Rioja", "5300");

		Aeropuerto theAirport = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", "IRJ", theCity);

		String returned = theAirport.showDenomination();

		assertEquals("Aeropuerto Capitán Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}
