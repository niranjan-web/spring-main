package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentId;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentId = studentRollNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public StudentEntity(String studentName, int studentRollNo, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentId = studentRollNo;
		this.studentAddress = studentAddress;
	}
	public StudentEntity() {
		super();
		
	}
	@Override
	public String toString() {
		return "StudentEntity [studentName=" + studentName + ", studentRollNo=" + studentId + ", studentAddress="
				+ studentAddress + "]";
	}
	
}
