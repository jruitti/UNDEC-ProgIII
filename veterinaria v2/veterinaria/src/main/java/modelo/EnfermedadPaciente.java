package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import modelo.Enfermedad;

/**
 * Entity implementation class for Entity: EnfermedadPaciente
 *
 */
@Entity
@SequenceGenerator(name="enfermedadpaciente_id_seq", sequenceName="enfermedadpaciente_id_seq",initialValue=0, allocationSize=1)
public class EnfermedadPaciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedadpaciente_id_seq")
	private long idEnfermedadPaciente;
	private LocalDate fechaEnfermedad;
	@OneToMany
	private List<Medicacion> medicacion;
	@ManyToOne
	private Enfermedad enfermedad;

	public EnfermedadPaciente() {
		super();
	}

	public long getIdEnfermedadPaciente() {
		return this.idEnfermedadPaciente;
	}

	public void setIdEnfermedadPaciente(long idEnfermedadPaciente) {
		this.idEnfermedadPaciente = idEnfermedadPaciente;
	}

	public LocalDate getFechaEnfermedad() {
		return this.fechaEnfermedad;
	}

	public void setFechaEnfermedad(LocalDate fechaEnfermedad) {
		this.fechaEnfermedad = fechaEnfermedad;
	}

	public List<Medicacion> getMedicacion() {
		return this.medicacion;
	}

	public void setMedicacion(List<Medicacion> medicacion) {
		this.medicacion = medicacion;
	}

	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

}
