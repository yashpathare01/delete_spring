package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{

}
