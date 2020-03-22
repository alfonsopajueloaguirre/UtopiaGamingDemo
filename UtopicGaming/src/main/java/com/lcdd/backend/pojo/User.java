package com.lcdd.backend.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String name;
	private String firstName;
	private String lastName;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;
	
	@ManyToOne
	private Role role;
	
	protected User() {}

	public User(String username) {
		this.name = username;
	}
	public User(String email, String name, String firstName, String lastName, String password, String  role) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = new ArrayList<>(Arrays.asList(role));
	}
	
	public User(String email, String name, String firstName, String lastName, String password, Role role,String... roles) {
		super();
		this.email = email;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
		this.roles = new ArrayList<>(Arrays.asList(roles));
	}

	public User(String email, String name, String firstName, String lastName, String password, String... roles) {
		super();
		this.email = email;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.roles = new ArrayList<>(Arrays.asList(roles));
	}
	
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswordHash(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}