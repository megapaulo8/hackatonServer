package com.hackaton.windev.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class NeighborhoodSpecifications implements Serializable {

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "neighborhood_id")
	private Neighborhood neighborhood;

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "specification_id")
	private Specification specification;

	public NeighborhoodSpecifications() {
	}

	public NeighborhoodSpecifications(Neighborhood neighborhood, Specification specification) {
		this.neighborhood = neighborhood;
		this.specification = specification;
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
		return "NeighborhoodSpecifications{" +
				"neighborhood=" + neighborhood +
				", specification=" + specification +
				'}';
	}
}
