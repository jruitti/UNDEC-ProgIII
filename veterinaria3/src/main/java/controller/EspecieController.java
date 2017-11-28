package controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import modelo.Especie;
import persistencia.EspecieFacade;

@ManagedBean(name = "especieController")
@SessionScoped
public class EspecieController implements Serializable {
	private static final long serialVersionUID = 1L;

	/* Inyección de dependencia del bean Facade, que representa la persistencia */
	@EJB
	private EspecieFacade elFacade;

	/*
	 * Atributo del ManagedBean que representa el objeto Especie a vincular en los
	 * componentes de interfaz
	 */
	private Especie current;

	public Especie getCurrent() {
		if (current == null) {
			current= new Especie();
		}
		return current;
	}

	public void setCurrent(Especie current) {
		this.current = current;
	}

	/* Método que se invoca cuando se hace clic en el botón Guardar Especie */
	public void guardarEspecie() {
		if (elFacade.registrarEspecie(current)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Especie creada correctamente", "Especie "+ current.getNombre()+" creada correctamente"));
			current = new Especie();
		}
		else
		{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se pudo registrar la especie", "Ocurrió un error al registrar la especie"));
		}
	}

}
