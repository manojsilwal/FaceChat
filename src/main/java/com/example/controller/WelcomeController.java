package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.repository.UserDao;
import com.example.service.UserService;

@Controller
public class WelcomeController {
 
    /*@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/home")
	@ResponseBody
	public String home(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		model.put("message", this.message);
		return "login";
	}
	
	

}