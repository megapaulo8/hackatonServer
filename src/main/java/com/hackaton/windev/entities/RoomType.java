package com.hackaton.windev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class RoomType implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	public RoomType() {
	}

	public RoomType(String name) {
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
		return "RoomType{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
