package com.hackaton.windev.entities;

import com.hackaton.windev.enums.RoomsItemsGrade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RoomsItems implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "room_id")
	private PropertiesRooms propertiesRooms;

	private String name;
	private String color;
	private Integer quantity;
	private String photoPath;

	@Enumerated(EnumType.STRING)
	private RoomsItemsGrade roomsItemsGrade;

	public RoomsItems() {
	}

	public RoomsItems(PropertiesRooms propertiesRooms, String name, String color, Integer quantity, String photoPath, RoomsItemsGrade roomsItemsGrade) {
		this.propertiesRooms = propertiesRooms;
		this.name = name;
		this.color = color;
		this.quantity = quantity;
		this.photoPath = photoPath;
		this.roomsItemsGrade = roomsItemsGrade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PropertiesRooms getPropertiesRooms() {
		return propertiesRooms;
	}

	public void setPropertiesRooms(PropertiesRooms propertiesRooms) {
		this.propertiesRooms = propertiesRooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public RoomsItemsGrade getRoomsItemsGrade() {
		return roomsItemsGrade;
	}

	public void setRoomsItemsGrade(RoomsItemsGrade roomsItemsGrade) {
		this.roomsItemsGrade = roomsItemsGrade;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "RoomsItems{" +
				"id=" + id +
				", propertiesRooms=" + propertiesRooms +
				", name='" + name + '\'' +
				", color='" + color + '\'' +
				", quantity=" + quantity +
				", photoPath='" + photoPath + '\'' +
				", roomsItemsGrade=" + roomsItemsGrade +
				'}';
	}
}
