package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Student;
import com.yash.repository.StudentRepo;

@Service
public class StudentServive 
{
	@Autowired
	private StudentRepo repo;
	
	//add student
	public Student addStudent(Student std)
	{
		return repo.save(std);
	}
}
