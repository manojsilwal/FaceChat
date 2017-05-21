package com.example.controller;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Role;
import com.example.domain.User;
import com.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService useService;
	 
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseBody
	public User save(@RequestBody User user) {
		useService.save(user);
		return user;
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	@ResponseBody
	public User delete(@PathVariable int id){
		User user = useService.getById(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	@ResponseBody
	public String save(){
		User user = new User(1,"manoj","1234","manojsilwal1@gmail.com");
		Set<Role> roles = new TreeSet<Role>();
		roles.add(new Role(2,"ADMIN"));
		user.setRoles(roles);
		 useService.save(user);
		 return  user.getUsername();
	}

}
