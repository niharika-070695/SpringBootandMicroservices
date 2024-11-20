package com.example.niharika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.StudentDao;
import com.example.niharika.entity.Login;
import com.example.niharika.entity.Student;
import com.example.niharika.service.LoginService;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//prepare two students information
//		Student st1 = new Student();
//		st1.setStudentName("Arjun");
//		st1.setStudentLocation("Hyderabad");
//		st1.setStudentEmail("arjun@yahoo.com");
//		st1.setStudentContactNo("897678987");
//		st1.setCreatedDate(new Date());
//		
//		Student st2 = new Student();
//		st2.setStudentName("Krishna");
//		st2.setStudentLocation("Secunderabad");
//		st2.setStudentEmail("krishna@yahoo.com");
//		st2.setStudentContactNo("456643543");
//		st2.setCreatedDate(new Date());
//		
//		//preparing the two logins for two students
//		Login login1 = new Login();
//		login1.setUsername("arjun@deloitte.com");
//		login1.setPassword("welcome@123");
//		login1.setStatus("Active");
//		login1.setCreatedDate(new Date());
//		login1.setStudent(st1);
//		
//		Login login2 = new Login();
//		login2.setUsername("krishna@deloitte.com");
//		login2.setPassword("thankyou@123");
//		login2.setStatus("Active");
//		login2.setCreatedDate(new Date());
//		login2.setStudent(st2);
//		
//		//calling the service
//	     loginService.saveAll(List.of(login1,login2));
	     
	     //parent to child access the records
//	     Student s = studentDao.findById(1).get();
//	     System.out.println("Student details are:::::"+ s);
//		 System.out.println("Student login details are:::::"+s.getLogin());
		
		studentDao.deleteById(1);
		
	}
}
