package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import entidades.empleado;

public class CRUDEmpledo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaJPA");
	EntityManager em = emf.createEntityManager();
	
	public void CrearEmpleado(empleado empleado) {	
		
		em.getTransaction().begin();
		em.persist(empleado);
		em.getTransaction().commit();		
		em.close();
		emf.close();
		
	} 
	
	public void ActualizarEmpleado(int iden) {
		
		em.getTransaction().begin();
		empleado emple = em.find(empleado.class, iden);
		System.out.println(emple);
		emple.setSalario(541);
		em.getTransaction().commit();
		System.out.println(emple);
		em.close();
		emf.close();		
		
	}
	
	public void PresentarEmpleados() {
	
		TypedQuery<empleado> query = em.createQuery("SELECT e FROM empleado e", empleado.class);		
		List<empleado> resultado = query.getResultList(); 
		
		for (empleado empleado : resultado) {
			System.out.println(empleado.getNombre());
		}
		
		//em.getTransaction().commit();
		//em.close();
		//emf.close();
	}
	
}
