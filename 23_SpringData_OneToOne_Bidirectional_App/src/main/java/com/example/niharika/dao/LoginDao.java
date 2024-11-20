package com.example.niharika.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.Login;

public interface LoginDao extends JpaRepository<Login,Integer> {

}
