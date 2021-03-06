package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String displayMethod()
	{
		return"home";
	}
	@PostMapping("/home")
	public String method(@ModelAttribute StudentEntity student) 
	{
		service.addStudent(student);
		return"display";
	}

}
