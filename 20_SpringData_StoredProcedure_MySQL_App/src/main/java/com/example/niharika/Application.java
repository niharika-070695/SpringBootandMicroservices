package com.example.niharika;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.CricketerDao;
import com.example.niharika.entity.Cricketer;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CricketerDao cricketerDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		System.out.println("1.DAO Interface method call..");
		String cricketerName = cricketerDao.fetchCricketerName(1002);
		System.out.println("Cricketer name...."+ cricketerName);
		
		System.out.println("2.DAO Interface method call for getting all cricketers");
		List<Cricketer> allCricketers = cricketerDao.fetchAllCricketers();
		allCricketers.forEach(System.out::println);
		
		System.out.println("2.DAO Interface method call for getting count of cricketers");
		Integer countOfCricketers = cricketerDao.getCountOfCricketers();
		System.out.println("Cricketer players count...."+ countOfCricketers );
		
	}

}
