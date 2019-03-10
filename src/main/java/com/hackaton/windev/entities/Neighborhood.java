package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Neighborhood implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "city_id")
	private City city;

	public Neighborhood() {
	}

	public Neighborhood(String name, City city) {
		this.name = name;
		this.city = city;
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Neighborhood{" +
				"id=" + id +
				", name='" + name + '\'' +
				", city=" + city +
				'}';
	}
}
