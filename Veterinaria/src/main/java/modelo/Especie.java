package modelo;

import java.io.Serializable;
import java.lang.String;
//import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Especie
 *
 */
@Entity
@Table(name = "especie", schema="public")

@SequenceGenerator(name="especie_id_seq", sequenceName="especie_id_seq",initialValue=0, allocationSize=1)
public class Especie implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="especie_id_seq")
	@Column(name="idespecie")
	private long idEspecie;
	@Column(name="nombre")
	private String nombre;
	

	public Especie() {
		super();
	}   
	public long getIdEspecie() {
		return this.idEspecie;
	}

	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
