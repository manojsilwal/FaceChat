package com.example.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.domain.User;
public interface UserDao extends CrudRepository<User,Integer>{
	public User findByUsername(String Username);
}
