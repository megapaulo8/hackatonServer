package com.hackaton.windev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PersonRole implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	public PersonRole() {
	}

	public PersonRole(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonRole{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
