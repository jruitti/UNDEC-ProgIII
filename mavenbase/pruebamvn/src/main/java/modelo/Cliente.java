package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import modelo.Domicilio;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity
@SequenceGenerator(name="cliente_id_seq", sequenceName="cliente_id_seq",initialValue=0, allocationSize=1)
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_id_seq")
	private long idCliente;
	private String apellidoFamilia;
	@ManyToOne
	private Domicilio domicilio;
	private String nroCuenta;
	private String telefono;
	@OneToMany(mappedBy="duenio")
	private List<Paciente> mascotas;
	

	public Cliente() {
		super();
	}   
	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}   
	public String getApellidoFamilia() {
		return this.apellidoFamilia;
	}

	public void setApellidoFamilia(String apellidoFamilia) {
		this.apellidoFamilia = apellidoFamilia;
	}   
	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}   
	public String getNroCuenta() {
		return this.nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}   
	public List<Paciente> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Paciente> mascotas) {
		this.mascotas = mascotas;
	}
   
}
