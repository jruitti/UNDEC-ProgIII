package modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import modelo.MotivoVisita;

/**
 * Entity implementation class for Entity: Visita
 *
 */
@Entity
@SequenceGenerator(name="visita_id_seq", sequenceName="visita_id_seq",initialValue=0, allocationSize=1)
public class Visita implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visita_id_seq")
	private long idVisita;
	private LocalDate fechaVisita;
	private float pesoVisita;
	@ManyToOne
	private MotivoVisita motivoVisita;
	

	public Visita() {
		super();
	}   
	public long getIdVisita() {
		return this.idVisita;
	}

	public void setIdVisita(long idVisita) {
		this.idVisita = idVisita;
	}   
	public LocalDate getFechaVisita() {
		return this.fechaVisita;
	}

	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}   
	public float getPesoVisita() {
		return this.pesoVisita;
	}

	public void setPesoVisita(float pesoVisita) {
		this.pesoVisita = pesoVisita;
	}   
	public MotivoVisita getMotivoVisita() {
		return this.motivoVisita;
	}

	public void setMotivoVisita(MotivoVisita motivoVisita) {
		this.motivoVisita = motivoVisita;
	}
   
}
