package edu.sjsu.cmpe275.lab2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
	public static void main(String[] args) {	      
		Employee employee = new Employee();
		employee.setFirstname("shailesh");
		
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "lab2" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );
	   }
}
