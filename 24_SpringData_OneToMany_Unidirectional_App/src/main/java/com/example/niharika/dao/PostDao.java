package com.example.niharika.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.Posts;

public interface PostDao extends JpaRepository<Posts,Integer>{

}
