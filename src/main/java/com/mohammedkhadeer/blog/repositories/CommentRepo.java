package com.mohammedkhadeer.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammedkhadeer.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
