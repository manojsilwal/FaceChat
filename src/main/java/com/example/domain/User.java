package com.example.domain;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User implements Comparable<User>{

	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String username;
	
	private String password;
	
	private String email;
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role")
	private Set<Role> roles = new TreeSet<Role>();
	
	
	public User(){}

	public User(int id,String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	

	public Set<Role> getRoles() {
		return roles;
	}



	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



	public int getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	@Override
	public int compareTo(User user) {
		
		return username.compareTo(user.getUsername());
	}
	
	
	
	
}
