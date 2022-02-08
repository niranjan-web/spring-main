package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
	

}
