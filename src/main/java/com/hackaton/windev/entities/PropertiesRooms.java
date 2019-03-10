package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PropertiesRooms implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;

	@OneToOne
	@JoinColumn(name = "type_id")
	private RoomType roomType;

	public PropertiesRooms() {
	}

	public PropertiesRooms(String name, Property property, RoomType roomType) {
		this.name = name;
		this.property = property;
		this.roomType = roomType;
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

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "PropertiesRooms{" +
				"id=" + id +
				", name='" + name + '\'' +
				", property=" + property +
				", roomType=" + roomType +
				'}';
	}
}
