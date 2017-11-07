package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enfermedad
 *
 */
@Entity
@SequenceGenerator(name="enfermedad_id_seq", sequenceName="enfermedad_id_seq",initialValue=0, allocationSize=1)
public class Enfermedad implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedad_id_seq")
	private long idEnfermedad;
	private String nombreEnfernedad;
	

	public Enfermedad() {
		super();
	}   
	public long getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(long idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}   
	public String getNombreEnfernedad() {
		return this.nombreEnfernedad;
	}

	public void setNombreEnfernedad(String nombreEnfernedad) {
		this.nombreEnfernedad = nombreEnfernedad;
	}
   
}
