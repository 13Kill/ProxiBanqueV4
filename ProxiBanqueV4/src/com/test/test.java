package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.service.IStudentService;
import com.service.StudentService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext context = new ClassPathXmlApplicationContext (new String[] {"applicationContext.xml"});
		
		IStudentService service = (IStudentService) context.getBean("service");
		
		Student student = new Student();
		student.setNom("TOTO");
		student.setPrenom("tata");
		
		service.insertStudent(student);

	}

}
