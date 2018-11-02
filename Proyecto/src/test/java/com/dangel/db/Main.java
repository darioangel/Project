package com.dangel.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

public class Main {

	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	
	public static void main(String[] args) {

	EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
	EntityTransaction transaccion = entityManager.getTransaction();	
	
//	emf = Persistence.createEntityManagerFactory("Persistencia");
//	manager = emf.createEntityManager();
	
//	List<Entrenador> entrenadores = (List<Entrenador>) manager.createQuery("FROM Entreador").getResultList();
// 	System.out.println("En esta base de datos hay" + entrenadores.size() + "entrenadores");
	
//	DateTime fecha = new DateTime("1991-09-09");
//	Entrenador trainer1 = new Entrenador(1L, "ash", "ket", fecha);
	
	transaccion.begin();
	//LocalDate fecha = new LocalDate("1991-09-09");
	Entrenador trainer1 = new Entrenador(1L, "ash", "ket");
	
	entityManager.persist(trainer1);
	
	Entrenador trainer2 = new Entrenador();
	trainer2.setCodigo(2L);
	trainer2.setNombre("dario");
	trainer2.setApellido("angel");
	
	
	entityManager.persist(trainer2);
	transaccion.commit();
	
	}

}
