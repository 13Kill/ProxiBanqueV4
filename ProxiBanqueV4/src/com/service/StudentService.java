package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IStudentDao;
import com.dao.StudentDao;
import com.model.Student;



@Service("studentservice")
@Transactional
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentDao studentDao;
	
	public void insertStudent(Student student){
		System.out.println("ici dans service");
		studentDao.insertStudent(student);
		
	}

}





