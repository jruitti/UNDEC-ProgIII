package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Raza
 *
 */
@Entity
@SequenceGenerator(name="raza_id_seq", sequenceName="raza_id_seq",initialValue=0, allocationSize=1)
public class Raza implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="raza_id_seq")
	private long idRaza;
	private String nombre;
	@ManyToOne
	private Especie especie;
	
	public Raza (){
		
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass()!= Raza.class){
			return false;
		}
		Raza r= (Raza)obj;
		return r.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
