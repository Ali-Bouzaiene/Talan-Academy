package com.thp.spring.simplecontext;

public class Moussaillon {
	private String firstName,lastName,config;

	public Moussaillon(String firstName, String lastName, String config) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.config = config;
	}

	public Moussaillon() {
		
	}
	
	//getter_setter

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

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	
	
	
	
}
