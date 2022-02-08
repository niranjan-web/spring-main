package com.spring.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.StudentEntity;
import com.spring.repository.StudentRepository;
import com.spring.service.StudentService;

@Service
public class ServiceImplementation implements StudentService
{
	@Autowired
	StudentRepository repo;
	@Override
	public void addStudent(StudentEntity obj) 
	{
		repo.save(obj);
		
	}

}
