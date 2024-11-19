package com.example.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.niharika.dao.StudentDao;
import com.example.niharika.entity.Student;

public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public void saveAllStudents(List<Student> students) {
		List<Student> saveAll = studentDao.saveAll(students);
		saveAll.forEach(System.out::println);
	}
}
