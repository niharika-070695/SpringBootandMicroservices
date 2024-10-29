package com.example.niharika;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Serializable>{

}
