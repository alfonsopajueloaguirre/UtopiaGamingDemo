package com.lcdd.backend.pojo;


import java.util.List;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String name;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;
	
	protected User() {}

	public User(String username) {
		this.name = username;
	}
	public User(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}