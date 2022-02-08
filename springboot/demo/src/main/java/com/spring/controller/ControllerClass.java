package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.StudentEntity;
import com.spring.service.StudentService;

@Controller
public class ControllerClass 
{
	private StudentService studentService;
	
@RequestMapping("/display")
public String displayWebPage()
{
	StudentEntity student = new StudentEntity();
	student.setStudentName("mark");
	
	studentService.addStudent(student);
	return "display";
}
}
