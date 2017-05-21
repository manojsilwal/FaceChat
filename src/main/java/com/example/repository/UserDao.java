package com.example.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.User;
public interface UserDao extends CrudRepository<User,Integer>{
	public User findByUsername(String Username);
}
