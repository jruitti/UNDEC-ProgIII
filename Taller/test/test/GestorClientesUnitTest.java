package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class GestorClientesUnitTest {

	@Test
	void agregarCliente_clienteCompleto_agregaCorrecto() {
		GestorCliente elGestor = new GestorCliente(new LinkedList<Cliente>());

		elGestor.crearCliente(factoryCliente());
		int ClientesLuegoDeCrear = elGestor.getColeccionClientes().size();
		
		assertEquals(1,ClientesLuegoDeCrear);
	}
	


	@Test
	void crearCliente_creacionCorrecta() {

		GestorCliente elGestor = new GestorCliente(new LinkedList<Cliente>());

		elGestor.crearCliente(factoryCliente());
		int clientesLuegoDeCrear = elGestor.getColeccionClientes().size();
		
		assertEquals(1,clientesLuegoDeCrear);

	}
	
	private Cliente factoryCliente() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		elcliente.asignarVehiculo(elVehiculo);
		return elCliente;
	}

}
