package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Especie;
import persistencia.DaoEspecie;

@ManagedBean(name="especieController")
@SessionScoped
public class EspecieController {

	
	private Especie actual;
	private List<Especie> listaEspecies;
	
	@EJB
	private DaoEspecie especieFacade;

	public Especie getActual() {
		return actual;
	}

	public void setActual(Especie actual) {
		this.actual = actual;
	}
	
	public List<Especie> getListaEspecies() {
		
		if(null == listaEspecies){
			listaEspecies = new ArrayList<Especie>();
		}
		return listaEspecies;
	}

	public void setListaEspecies(List<Especie> listaEspecies) {
		this.listaEspecies = listaEspecies;
	}

	public void GuardarEspecie(){
		
		double numero = Math.random();
		
		System.out.println("EspecieMB > GuardarEspecie");
		
		Especie e = new Especie();
		e.setNombre("Felinos" + numero);
		
		especieFacade.persistirEspecie(e);
		
	}
	
	public void CargarEspecies(){
		
		this.setListaEspecies(especieFacade.obtenerTodasLasEspecies()); 
		
		System.out.println("Cantidad de Especies: " + this.getListaEspecies().size());
		
		for(Especie e : this.getListaEspecies()){
			System.out.println("Especie > " + e.getNombre());
		}
	}
}
