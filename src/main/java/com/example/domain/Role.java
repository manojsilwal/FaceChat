package com.example.domain;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Role implements Comparable<Role>{
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String type;
	
	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new TreeSet<User>();

	public Role(int id, String role) {
		// TODO Auto-generated constructor stub
		this.id = id;
		type = role;
	}
	

	public Set<User> getUsers() {
		return users;
	}


	public void setUsers(Set<User> users) {
		this.users = users;
	}



	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public int compareTo(Role role) {
		// TODO Auto-generated method stub
		
		return role.getType().compareTo(type);
	}

	/*s*/
	
	
}
