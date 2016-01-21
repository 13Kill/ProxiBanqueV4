package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDao implements IStudentDao{
	
//	@PersistenceContext
//	private EntityManager em;
	
	public void insertStudent(Student student){			
		
		System.out.println("ici dans DAO");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		

		
		// 1 : Ouverture unité de travail JPA
				
				
				// 2 : Ouverture transaction 
				EntityTransaction tx =  em.getTransaction();
				tx.begin();
				
				
				//4 : Persistance Objet/Relationnel : création d'un enregistrement en base
				em.persist(student);
				
				// 5 : Fermeture transaction 
				 tx.commit();
				
				// 6 : Fermeture unité de travail JPA 
				em.close();
				emf.close();			
		
	}

}
