package com.example.niharika.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.util.Streamable;

import com.example.niharika.entity.Cricketer;

public interface CricketerDao extends CrudRepository<Cricketer,Integer>{
	
	@Query(value = "call GET_ALL_CRICKETERS()", nativeQuery = true)
	public List<Cricketer> fetchAllCricketers();
	
	@Query(value = "call GET_CRICKETER_COUNT", nativeQuery = true)
	public Integer getCountOfCricketers();
	
	
	@Procedure(value = "GET_CRICKETER_BY_ID()", outputParameterName = "crickName")
	public String fetchCricketerName(@Param("crickId")Integer cricketerId);
	
	
	
	

}
