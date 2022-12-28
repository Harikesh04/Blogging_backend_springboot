package com.mohammedkhadeer.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mohammedkhadeer.blog.entities.Category;
import com.mohammedkhadeer.blog.entities.Post;
import com.mohammedkhadeer.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	//here we can create methods for post.
	//these are custom finder methods

	//JPA finder methods are the most powerful methods, we can create finder methods to select the records from the database without writing SQL queries. Behind the scenes, Data JPA will create SQL queries based on the finder method and execute the query for us.

	//To create finder methods for the entity class field name, we need to create a method starting with findBy followed by field name. Consider the following Employee entity class which has 2 fields name and location

	List<Post> findByUser(User user);//for finding the post by user
	List<Post> findByCategory(Category category);	//for finding the post by categoryz
	
	@Query("select p from Post p where p.title like :key")
	List<Post> searchByTitle(@Param("key") String title);
	

}
