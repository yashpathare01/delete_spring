package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Student;
import com.yash.service.StudentServive;

@RestController
public class StudentController 
{
	@Autowired
	private StudentServive servive;
	
	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student stu)
	{
		return servive.addStudent(stu);
	}
}
