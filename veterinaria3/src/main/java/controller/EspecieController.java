package controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Especie;
import persistencia.EspecieFacade;


@ManagedBean (name="especieController")
@SessionScoped
public class EspecieController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private EspecieFacade elFacade;
	
	private Especie current;
	private Especie especieGuardar;
	private long idElegido;
	private String mensaje;
	
	
	public Especie getCurrent() {
		if(current==null)
		{
			return new Especie();
		}
		return current;
	}

	public void setCurrent(Especie current) {
		this.current = current;
	}
	
	public String getMensaje() {
		return "Mashita";
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public long getIdElegido() {
		return idElegido;
	}

	public void setIdElegido(long idElegido) {
		this.idElegido = idElegido;
	}
	
	
	public void retornarEspecie() {
		current=elFacade.devolverEspecie(idElegido);
		System.out.println("Current >>" + current.getNombre());
	}
	
	public void guardarEspecie() {
		elFacade.registrarEspecie(especieGuardar);
		System.out.println("Registrar Especie Current >>" + especieGuardar.getNombre());
		especieGuardar=new Especie();
	}

	public Especie getEspecieGuardar() {
		if(especieGuardar==null) {
			especieGuardar=new Especie();
		}
			return especieGuardar;
	}

	public void setEspecieGuardar(Especie especieGuardar) {
		this.especieGuardar = especieGuardar;
	}

	
	

}
