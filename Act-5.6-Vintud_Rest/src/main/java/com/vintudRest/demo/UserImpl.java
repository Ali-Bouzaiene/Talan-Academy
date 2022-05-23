package com.vintudRest.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table (name = "users")
public class UserImpl implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="pseudo")
	private String pseudo;
	@Column(name="u_password")
	private String password;
	@Column(name="mail")
	private String mail;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String address;
	@Column(name="role_id")
	private long role_id;
	


	public UserImpl(String first_name, String last_name, String pseudo, String password, String mail, String phone,
			String address, long role_id) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
		this.role_id = role_id;
	}

	public UserImpl() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "UserImpl [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", pseudo=" + pseudo
				+ ", password=" + password + ", mail=" + mail + ", phone=" + phone + ", address=" + address
				+ ", role_id=" + role_id + "]";
	}		
	
	
}
