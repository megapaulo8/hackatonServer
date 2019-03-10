package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String fullName;
	private String email;
	private String phone;
	private String cpf;
	private String picturePath;
	private String password;
	private String registerDate;
	private String isActive;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	public Person() {
	}

	public Person(String fullName, String email, String phone, String password) {
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", fullName='" + fullName + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", cpf='" + cpf + '\'' +
				", picturePath='" + picturePath + '\'' +
				", password='" + password + '\'' +
				", registerDate='" + registerDate + '\'' +
				", isActive='" + isActive + '\'' +
				", address=" + address +
				'}';
	}
}
