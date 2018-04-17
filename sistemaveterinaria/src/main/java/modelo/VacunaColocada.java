package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import modelo.Enfermedad;

/**
 * Entity implementation class for Entity: VacunaColocada
 *
 */
@Entity
@SequenceGenerator(name="vacunacolocada_id_seq", sequenceName="vacunacolocada_id_seq",initialValue=0, allocationSize=1)
public class VacunaColocada implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vacunacolocada_id_seq")
	private long idVacunaColocada;
	private LocalDate fechaColocacion;
	@ManyToOne
	private Enfermedad enfermedad;
	

	public VacunaColocada() {
		super();
	}   
	public long getIdVacunaColocada() {
		return this.idVacunaColocada;
	}

	public void setIdVacunaColocada(long idVacunaColocada) {
		this.idVacunaColocada = idVacunaColocada;
	}   
	public LocalDate getFechaColocacion() {
		return this.fechaColocacion;
	}

	public void setFechaColocacion(LocalDate fechaColocacion) {
		this.fechaColocacion = fechaColocacion;
	}   
	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
   
}
