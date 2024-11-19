package com.example.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.niharika.dao.LoginDao;
import com.example.niharika.entity.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public void saveAll(List<Login> logins) {
		List<Login> saveAll = loginDao.saveAll(logins);
		saveAll.forEach(l->System.out.println(l));
		
	}

}
