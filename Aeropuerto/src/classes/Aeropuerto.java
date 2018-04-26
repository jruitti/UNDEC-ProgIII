package clases;

public class Aeropuerto {

	private final Integer idAeropuerto;
	private final String nombre;
	private final String codigo;
	private final Ciudad ciudad;

	public Aeropuerto(Integer idAeropuerto, String nombre, String codigo, Ciudad ciudad) {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.codigo = codigo;
		this.ciudad = ciudad;
	}

}
