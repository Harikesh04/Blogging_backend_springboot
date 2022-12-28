package com.mohammedkhadeer.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammedkhadeer.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	//here we can create methods for user.
	//these are custom finder methods

	//JPA finder methods are the most powerful methods, we can create finder methods to select the records from the database without writing SQL queries. Behind the scenes, Data JPA will create SQL queries based on the finder method and execute the query for us.

	//To create finder methods for the entity class field name, we need to create a method starting with findBy followed by field name. Consider the following Employee entity class which has 2 fields name and location	
	
	Optional<User> findByEmail(String email);//for finding user by email.
}
//Jpa repository required two parameters <TYPE_OF_THE_ENTITY,TYPE_OF_THE_PRIMARY_KEY>

//JPA Repository is mainly used for managing the data in a Spring Boot Application.
//JpaRepository is a JPA (Java Persistence API) specific extension of Repository. It contains the full API of CrudRepository and PagingAndSortingRepository. So it contains API for basic CRUD operations and also API for pagination and sorting.