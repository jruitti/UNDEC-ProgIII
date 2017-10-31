package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicamento
 *
 */
@Entity
@SequenceGenerator(name="medicamento_id_seq", sequenceName="medicamento_id_seq",initialValue=0, allocationSize=1)
public class Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicamento_id_seq")
	private long idMedicamento;
	private String codigo;


	private String nombre;
	

	public Medicamento() {
		super();
	}   
	public long getIdMedicamento() {
		return this.idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}   
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
