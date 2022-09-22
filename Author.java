package com.inheritance_interface.bll;

public class Author {
	private String name;
	private String email;
	
	
	public Author() {
		
	}
	public Author(Author aut)
	{
		this.name=aut.getName();
		this.email=aut.getEmail();
	}
	
	public Author(String name, String email) {
		
		this.name = name;
		this.email = email;
		
	}
	public Author(String name) {
		this.name=name;
	}	
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + "]";
	}

	
}

