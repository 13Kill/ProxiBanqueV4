package com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.service.IStudentService;

@ManagedBean(name="studentBean") 
@SessionScoped
@Component
public class StudentBean {
	
	
	@Autowired
	private IStudentService studentservice;
	
    private String nom; 
    private String prenom;
   
	
    // Constructeur vide
    public StudentBean() {
		super();
	}

    // Getters et Setters
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	} 
    
	public String insert(){
		Student student = new Student();
		student.setNom(getNom());
		student.setPrenom(getPrenom());
		studentservice.insertStudent(student);
		return "ok";
	}
	
    
    

}




 

 
 

 
