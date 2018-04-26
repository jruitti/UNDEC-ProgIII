package interactors;

import classes.Ciudad;
import repository.CityRepository;

public class CreateCityUseCase {

	private final CityRepository cityRepository;

	public CreateCityUseCase(CityRepository pCity) {
		this.cityRepository = pCity;
	}

	public Ciudad createCity(Ciudad pCity) {
		return this.cityRepository.save(pCity);
	}

}
