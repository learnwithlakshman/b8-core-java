package com.careerit.cj.collection.mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
	private String username;
	private String password;
	private String email;

	User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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

}

class LoginService {
	private List<User> users;
	private Map<String, User> map = new HashMap<String, User>();

	public LoginService() {
		users = new ArrayList<User>();
		users.add(new User("krish", "krish@123", "krish@gmail.com"));
		users.add(new User("manoj", "manoj@123", "manoj@gmail.com"));
		users.add(new User("charan", "charan@123", "charan@gmail.com"));
		users.add(new User("kiran", "kiran@123", "kiran@gmail.com"));
		// We have big user list..... 10K

		for (User user : users) {
			map.put(user.getUsername(), user);
		}

	}

	public User login(String username, String password) throws BadCredentialsException {
		// Logic

		User user = map.get(username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}
		throw new BadCredentialsException("Invalid username or password");
	}
}
public class LoginExample {

		public static void main(String[] args) {
			
				LoginService loginService = new LoginService();
				try {
					User user = loginService.login("xyz", "krish@123");
					System.out.println("Welcome :"+user.getUsername());
				}catch (BadCredentialsException e) {
					System.out.println(e);
				}
				
				try {
					User user = loginService.login("krish", "krish@123");
					System.out.println("Welcome :"+user.getUsername());
				}catch (BadCredentialsException e) {
					System.out.println(e);
				}
				
				try {
					User user = loginService.login("manoj", "manoj@123");
					System.out.println("Welcome :"+user.getUsername());
				}catch (BadCredentialsException e) {
					System.out.println(e);
				}
		}
}
