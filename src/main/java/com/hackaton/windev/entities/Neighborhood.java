package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Neighborhood implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "city_id")
	private City city;

	@OneToMany(mappedBy = "neighborhood")
	private Set<NeighborhoodsSpecifications> neighborhoodsSpecifications;

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

	public Set<NeighborhoodsSpecifications> getNeighborhoodsSpecifications() {
		return neighborhoodsSpecifications;
	}

	public void setNeighborhoodsSpecifications(Set<NeighborhoodsSpecifications> neighborhoodsSpecifications) {
		this.neighborhoodsSpecifications = neighborhoodsSpecifications;
	}

	@Override
	public String toString() {
		return "Neighborhood{" +
				"id=" + id +
				", name='" + name + '\'' +
				", city=" + city +
				", neighborhoodsSpecifications=" + neighborhoodsSpecifications +
				'}';
	}
}
