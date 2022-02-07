package com.student.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepository repo;

	@Override
	public void addStudent(StudentEntity student) 
	{
		repo.save(student);
		
		
	}

}
