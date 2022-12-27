package com.mohammedkhadeer.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammedkhadeer.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
