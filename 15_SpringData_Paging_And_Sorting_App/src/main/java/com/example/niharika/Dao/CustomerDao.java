package com.example.niharika.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.niharika.entity.Customer;


@Repository
public interface CustomerDao extends PagingAndSortingRepository<Customer,Integer>,
                                     CrudRepository<Customer,Integer>{

}
