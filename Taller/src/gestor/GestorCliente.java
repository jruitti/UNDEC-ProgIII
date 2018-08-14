package gestor;

import java.util.Collection;
import java.util.LinkedList;

import clases.Cliente;

public class GestorCliente {

	private Collection<Cliente> coleccionClientes;

	public GestorCliente(LinkedList<Cliente> coleccionClientes) {
		this.coleccionClientes = coleccionClientes;
	}

	public void crearCliente(Cliente elCliente) {
		this.coleccionClientes.add(elCliente);

	}

	public LinkedList<Cliente> getColeccionClientes() {
		return (LinkedList<Cliente>) this.coleccionClientes;
	}

}
