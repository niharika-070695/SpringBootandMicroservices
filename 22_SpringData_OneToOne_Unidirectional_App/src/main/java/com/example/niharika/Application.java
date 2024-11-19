package com.example.niharika;

import com.example.niharika.entity.Student;
import com.example.niharika.service.LoginService;
import com.example.niharika.service.StudentService;
import com.example.niharika.dao.LoginDao;
import com.example.niharika.entity.Login;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private LoginService loginService;
	
	@Autowired 
	private LoginDao loginDao;

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
//		
//		Login login2 = new Login();
//		login2.setUsername("krishna@deloitte.com");
//		login2.setPassword("thankyou@123");
//		login2.setStatus("Active");
//		login2.setCreatedDate(new Date());
//		login2.setStudent(st2);
		
		//calling the service
//		loginService.saveAll(List.of(login1,login2));
		
		//Getting the login information based on Id
		Optional<Login> loginObj = loginDao.findById(1);
		if(loginObj.isPresent()) {
			Login loginObject = loginObj.get();
			System.out.println(loginObject);
			System.out.println(loginObject.getStudent());
		}
		
	}

}
