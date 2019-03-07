package servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.empleado;

public class crearEmpleado {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		empleado emple = new empleado();
		emple.setNombre("Erika");
		emple.setSalario(550.75);
		emple.setDeg("Area de Sistemas");
		
		em.persist(emple);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
