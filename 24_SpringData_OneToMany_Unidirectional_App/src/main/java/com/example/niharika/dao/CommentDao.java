package com.example.niharika.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.Comments;

public interface CommentDao extends JpaRepository<Comments,Integer>{

}
