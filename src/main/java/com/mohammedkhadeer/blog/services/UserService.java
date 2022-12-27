package com.mohammedkhadeer.blog.services;

import java.util.List;

import com.mohammedkhadeer.blog.payloads.UserDto;

public interface UserService {

	UserDto registerNewUser(UserDto user);

	//here userDTO is data transfer object which have some field or may be all fields of entity which we uses for data transfer.
	
	
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);

}
//controller depends on service layer

//here we define method in service layer and  implement  that method in ServiceImpl layer.
