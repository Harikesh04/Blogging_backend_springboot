package com.mohammedkhadeer.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammedkhadeer.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
		
	
	Optional<User> findByEmail(String email);
}
//Jpa repository required two parameters <TYPE_OF_THE_ENTITY,TYPE_OF_THE_PRIMARY_KEY>

//JPA Repository is mainly used for managing the data in a Spring Boot Application.
//JpaRepository is a JPA (Java Persistence API) specific extension of Repository. It contains the full API of CrudRepository and PagingAndSortingRepository. So it contains API for basic CRUD operations and also API for pagination and sorting.