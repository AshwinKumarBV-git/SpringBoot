package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity

public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int Id;
	private String model;
	private String color;
	private int price;
	public BikeEntity(int id, String model, String color, int price) {
		super();
		Id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BikeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
