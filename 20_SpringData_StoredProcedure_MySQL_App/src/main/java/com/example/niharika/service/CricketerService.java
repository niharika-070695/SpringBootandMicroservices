package com.example.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.niharika.dao.CricketerDao;
import com.example.niharika.entity.Cricketer;

import jakarta.persistence.EntityManager;

public class CricketerService {

	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private CricketerDao cricketerDao;
	
	public void getAllCricketersByNativeQuery() {
		List<Cricketer> allCricketers = cricketerDao.fetchAllCricketers();
		allCricketers.forEach(System.out::println);
	}
	
}
