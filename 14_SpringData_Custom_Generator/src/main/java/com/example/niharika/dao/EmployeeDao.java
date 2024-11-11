package com.example.niharika.dao;

import java.io.Serializable;
import com.example.niharika.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Serializable>{

}
