package repository;

import java.util.Collection;

import classes.Piloto;
import classes.Vuelo;

public interface FlightRepository {

	Collection<Vuelo> getFlights(Piloto aPilot);

}