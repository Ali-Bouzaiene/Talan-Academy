package com.Spring.vintudHb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="users")
public class UserImpl implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="pseudo")
	private String pseudo;
	@Column(name="mail")
	private String mail;
	@Column(name="u_password")
	private String password;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String adress;
	@ManyToOne @JoinColumn( name="role_id" )
	private int roleId;


	// constructor
	public UserImpl() {
	}

	// constructor with all attributes
	public UserImpl(String firstName, String lastName, String pseudo, String mail, String password,
			String phone, String adress, int roleId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.adress = adress;
		this.roleId = roleId;

	}
	
	//getter_setter
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}
