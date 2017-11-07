package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MotivoVisita
 *
 */
@Entity
@SequenceGenerator(name="motivovisita_id_seq", sequenceName="motivovisita_id_seq",initialValue=0, allocationSize=1)
public class MotivoVisita implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="motivovisita_id_seq")
	private long idMotivoVisita;
	private String descripcion;
	

	public MotivoVisita() {
		super();
	}   
	public long getIdMotivoVisita() {
		return this.idMotivoVisita;
	}

	public void setIdMotivoVisita(long idMotivoVisita) {
		this.idMotivoVisita = idMotivoVisita;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
   
}
