package com.validate.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	@NotBlank(message="Username cannot be empty!!")
	@Size(min = 3,max = 12)
	private String username;
	
	@NotBlank(message="Enter email!!")
	@Pattern(regexp="^[a-zA-z0-9+_.-]+@[a-z]+\\.[a-zA-z0-9+_.-]+$",message="Enter a valid email!!")
	private String email;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	
}
