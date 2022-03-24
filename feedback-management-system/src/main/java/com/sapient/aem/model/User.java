package com.sapient.aem.model;
import javax.management.relation.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	private Integer userid;
	private String userName;
	private String password;
	private Role role;
	
	
	public User(String username, String password, Role role) {
		super();
		this.userName = username;
		this.password = password;
		this.role = role;
	}


		
	
	
	
	
		
}