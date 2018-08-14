package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Vehiculo;

class VehiculoUnitTest {

	@Test
	void instanciarVehiculo_VehiculoSinPatente_generaError() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", null, 2009);
		
		assertNull(elVehiculo);		
	}
	
	@Test
	void instanciarVehiculo_VehiculoCompleto_instanciaCorrecta() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		
		assertNotNull(elVehiculo);		
	}
	
	@Test
	void mostrarVehiculo_formatoEspecifico_muestraFormateado() {
		Vehiculo elVehiculo=Vehiculo.instancia(1,"VW Golf","ABC123",2009);
		String formatoSalida=elVehiculo.mostrarVehiculo();
		
		assertEquals("VW Golf modelo 2009 - Patente ABC123", formatoSalida);
	}

}
