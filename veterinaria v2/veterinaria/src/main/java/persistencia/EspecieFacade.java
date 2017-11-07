package persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import modelo.Especie;

@Stateless
public class EspecieFacade {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	//@PersistenceContext(unitName = "veterinaria")
    //private EntityManager em;
	
	public EspecieFacade() {}
	
	public boolean registrarEspecie(Especie pEspecie) {
		
		System.out.println("Especie: " + pEspecie.getIdEspecie());
		System.out.println("Especie Nombre: " + pEspecie.getNombre());
		System.out.println("Especie Hash: " + pEspecie.hashCode());
		
		System.out.println("Es Managed? "+em.contains(pEspecie));
		
		try {
//			em.getTransaction().begin();
			em.persist(pEspecie);
//			em.getTransaction().commit();
//			System.out.println("CARGANDO DRIVER POSTGRES...");
//			  Class.forName("org.postgresql.Driver");
//			  System.out.println("CARGO BIEN ASD");
//			} catch(ClassNotFoundException e) {
//				System.out.println("ERRORRRRRR");
			
			System.out.println("Especie: " + pEspecie.getIdEspecie());
			System.out.println("Especie Nombre: " + pEspecie.getNombre());
			System.out.println("Especie Hash: " + pEspecie.hashCode());
			
			return true;

		} catch (Exception e) {
			System.out.println("ERRORRRRRR Registrar");
			System.out.println(e.getMessage());
		}
		
		return false;

	}
	
//	public boolean isDetached(Entity entity) {
//	    return entity.id != null  // must not be transient
//	        && !em.contains(entity)  // must not be managed now
//	        && em.find(Entity.class, entity.id) != null;  // must not have been removed
//	}
//
//	public boolean modificarEspecie(Especie pEspecie) {
//
//		try {
//			em = emf.createEntityManager();
//			em.getTransaction().begin();
//			em.merge(pEspecie);
//			em.getTransaction().commit();
//			return true;
//		} catch (Exception e) {
//			// TODO: handle exception
//			em.getTransaction().rollback();
//			System.out.println("ERRORRRRRR Modificar");
//			System.out.println(e.getMessage());
//		}
//		return false;
//
//	}
//
//	public boolean borrarEspecie(Especie pEspecie) {
//
//		try {
//			em = emf.createEntityManager();
//			em.getTransaction().begin();
//			em.remove(pEspecie);
//			em.getTransaction().commit();
//			return true;
//		} catch (Exception e) {
//			// TODO: handle exception
//			em.getTransaction().rollback();
//			System.out.println("ERRORRRRRR Borrar");
//			System.out.println(e.getMessage());
//		}
//		return false;
//
//	}
//
	public Especie devolverEspecie(long idEspecie) {

		try {
			return em.find(Especie.class, idEspecie);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORRRRRR Devolver una");
			System.out.println(e.getMessage());
		}
		return null;

	}
	
	public List<Especie> devolverEspeciesTotal() {
		System.out.println("Antes");
		try {
			TypedQuery<Especie> consulta= em.createQuery("SELECT c FROM Especie c", Especie.class);
			return consulta.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORRRRRR Devolver todas");
			System.out.println(e.getMessage());
		}
		return new ArrayList<Especie>();
	}
	
	public List<Especie> devolverEspeciesNombre(String pNombre) {
		try {
			TypedQuery<Especie> query = em.createQuery("Select e FROM Especie e WHERE upper(e.nombre) LIKE :nombre", Especie.class);
			query.setParameter("nombre", "%" + pNombre + "%");
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORRRRRR Devolver algunas");
			System.out.println(e.getMessage());
		}
		return new ArrayList<Especie>();
	}
	
	public String souter() {
		return "Mashita";
	}


}
