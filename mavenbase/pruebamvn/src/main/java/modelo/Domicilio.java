package modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import modelo.Localidad;

/**
 * Entity implementation class for Entity: Domicilio
 *
 */
@Entity
@SequenceGenerator(name="domicilio_id_seq", sequenceName="domicilio_id_seq",initialValue=0, allocationSize=1)
public class Domicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domicilio_id_seq")
	private long idDomicilio;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String departamento;
	@ManyToOne
	private Localidad localidad;

	public Domicilio() {
		super();
	}

	public long getIdDomicilio() {
		return this.idDomicilio;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Localidad getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

}
