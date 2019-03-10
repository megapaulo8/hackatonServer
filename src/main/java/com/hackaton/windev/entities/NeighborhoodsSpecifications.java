package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class NeighborhoodsSpecifications implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "neighborhood_id")
	private Neighborhood neighborhood;

	@ManyToOne
	@JoinColumn(name = "specification_id")
	private Specification specification;

	public NeighborhoodsSpecifications() {
	}

	public NeighborhoodsSpecifications(Neighborhood neighborhood, Specification specification) {
		this.neighborhood = neighborhood;
		this.specification = specification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	@Override
	public String toString() {
		return "NeighborhoodsSpecifications{" +
				"id=" + id +
				", neighborhood=" + neighborhood +
				", specification=" + specification +
				'}';
	}
}
