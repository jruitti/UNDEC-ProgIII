package modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import modelo.Medicamento;

/**
 * Entity implementation class for Entity: Medicacion
 *
 */
@Entity
@SequenceGenerator(name="medicacion_id_seq", sequenceName="medicacion_id_seq",initialValue=0, allocationSize=1)
public class Medicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicacion_id_seq")
	private long idMedicacion;
	private String dosis;
	private Integer intervalo;
	private String periodo;
	@ManyToOne
	private Medicamento medicamento;

	public Medicacion() {
		super();
	}

	public long getIdMedicacion() {
		return this.idMedicacion;
	}

	public void setIdMedicacion(long idMedicacion) {
		this.idMedicacion = idMedicacion;
	}

	public String getDosis() {
		return this.dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public Integer getIntervalo() {
		return this.intervalo;
	}

	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Medicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

}
