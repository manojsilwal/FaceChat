package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void save(User user){
		userDao.save(user);
	}
	
	
	public User getById(int id){
		return userDao.findOne(id);
	}
	
	public Iterable<User> getAll(){
		return userDao.findAll();
	}
	
	public void update(User user){
		userDao.save(user);
	}
	
	public void delete(int id){
		userDao.delete(id);
	}


	public User getByUserName(String username) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");
		System.out.println(userDao.findByUsername(username).getUsername());
		return userDao.findByUsername(username);
		
	}
	
}
