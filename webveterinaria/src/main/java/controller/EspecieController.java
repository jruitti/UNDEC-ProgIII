package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Especie;
import persistencia.EspecieFacade;


@ManagedBean (name="especieController")
@SessionScoped
public class EspecieController {

	@EJB
	private EspecieFacade especieFacade;

	public EspecieController() {

	}

	@PostConstruct
	private void iniciar() {
	}

	private Especie current;
	private List<Especie> lasEspecies;

	//Inicio Getter y Setter
	public Especie getCurrent() {
		if (current == null) {
			current = new Especie();
		}
		return current;
	}


	public void setCurrent(Especie current) {
		this.current = current;
	}

	public List<Especie> getLasEspecies() {
		return lasEspecies;
	}

	public void setLasEspecies(List<Especie> lasEspecies) {
		this.lasEspecies = lasEspecies;
	}
	
	//Fin Getter y Setter
	


	public String obtenerEspecies() {
		this.lasEspecies=especieFacade.devolverEspeciesTotal();
		return null;
	}

	// public String llamarFacade() {
	// return ef.souter();
	// }

	// Logica MB
	public String guardarEspecie() {
		if (especieFacade.registrarEspecie(getCurrent())) {
			// current=new Especie();
			return "especie";
		}
		return null;
	}

}
