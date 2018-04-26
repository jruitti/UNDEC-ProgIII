package repository;

import java.util.Collection;

import classes.Ciudad;

public interface CityRepository {

	Ciudad save(Ciudad pCity);

	Ciudad update(Ciudad pCity);

	Ciudad findById(int pID);

	Collection<Ciudad> findAllCities();

}
