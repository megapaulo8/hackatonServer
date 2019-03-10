package com.hackaton.windev.entities;

import com.hackaton.windev.enums.SpecificationType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Specification implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy = "specification")
	private Set<NeighborhoodsSpecifications> neighborhoodsSpecifications;

	@Enumerated(EnumType.STRING)
	private SpecificationType type;

	public Specification() {
	}

	public Specification(String name, SpecificationType type) {
		this.name = name;
		this.type = type;
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

	public SpecificationType getType() {
		return type;
	}

	public void setType(SpecificationType type) {
		this.type = type;
	}

	public Set<NeighborhoodsSpecifications> getNeighborhoodsSpecifications() {
		return neighborhoodsSpecifications;
	}

	public void setNeighborhoodsSpecifications(Set<NeighborhoodsSpecifications> neighborhoodsSpecifications) {
		this.neighborhoodsSpecifications = neighborhoodsSpecifications;
	}

	@Override
	public String toString() {
		return "Specification{" +
				"id=" + id +
				", name='" + name + '\'' +
				", neighborhoodsSpecifications=" + neighborhoodsSpecifications +
				", type=" + type +
				'}';
	}
}
