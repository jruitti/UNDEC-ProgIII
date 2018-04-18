package aeropuertoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import aeropuertoInteractors.PilotsInteractor;
import clases.Piloto;

public class PilotoTest {

	@Test
	public void getSurnameAndName_FormatCriteria_ShowCorrectFormat() {
		final Piloto unPiloto = makeAPilot();
		final String pilotName = unPiloto.getSurnameAndName();
		assertEquals("Perez, Juan Antonio", pilotName);
	}

	@Test
	public void getAgeMethod_CalculateAgeMock_Return34() {
		final Piloto unPiloto = makeAPilot();
		final int pilotAge = unPiloto.getAge(LocalDate.of(2018, 4, 13));
		assertEquals(34, pilotAge);
	}

	@Test
	public void Pilots_AgeCriteria_OutputOrderDesc() {

		final LinkedList<Piloto> pilotList = makePilots();

		final String orderedPilots = PilotsInteractor.orderPilotsByAgeDesc(pilotList);

		assertEquals(
				"López, Juan Carlos - 67 años.\r\n" + "Gómez, Juan Gabriel - 57 años.\r\n"
						+ "Perez, Juan Antonio - 47 años.\r\n" + "Martínez, Juan Ignacio - 39 años.\r\n",
				orderedPilots);

	}

	@Test
	public void Pilots_AgeCriteriaEqualDateOfBirth_OutputOrderIndistinctly() {

		final Piloto juanMartinez = new Piloto(2, "Martínez", "Juan Ignacio", "08081978", LocalDate.of(1970, 7, 7));
		final Piloto juanPerez = new Piloto(1, "Perez", "Juan Antonio", "07071970", LocalDate.of(1970, 7, 7));

		final LinkedList<Piloto> pilotList = new LinkedList<>();
		pilotList.add(juanPerez);
		pilotList.add(juanMartinez);

		final String orderedPilots = PilotsInteractor.orderPilotsByAgeDesc(pilotList);

		assertEquals("Perez, Juan Antonio - 47 años.\r\n" + "Martínez, Juan Ignacio - 47 años.\r\n", orderedPilots);

	}

	private LinkedList<Piloto> makePilots() {
		final Collection<Piloto> losPilotos = new LinkedList<Piloto>();
		final Piloto juanPerez = new Piloto(1, "Perez", "Juan Antonio", "07071970", LocalDate.of(1970, 7, 7));
		final Piloto juanMartinez = new Piloto(2, "Martínez", "Juan Ignacio", "08081978", LocalDate.of(1978, 8, 8));
		final Piloto juanLopez = new Piloto(3, "López", "Juan Carlos", "05051950", LocalDate.of(1950, 5, 5));
		final Piloto juanGomez = new Piloto(4, "Gómez", "Juan Gabriel", "10101960", LocalDate.of(1960, 10, 10));
		losPilotos.add(juanPerez);
		losPilotos.add(juanMartinez);
		losPilotos.add(juanLopez);
		losPilotos.add(juanGomez);
		return (LinkedList<Piloto>) losPilotos;
	}

	private Piloto makeAPilot() {
		return new Piloto(1, "Perez", "Juan Antonio", "07071970", LocalDate.of(1984, 1, 31));
	}

}
