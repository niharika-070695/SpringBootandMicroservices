package com.example.niharika.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
