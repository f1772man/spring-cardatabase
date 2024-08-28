package com.packt.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity		// Entity (테이블 모델링 Table - Car 클래스를 테이블로 만들겠다. 
public class Car {
	// 1. 속성(멤버 Field)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand;
	private String model;
	private String color;
	private String registerName;
	private int year, price;
	
	// 생성자 (Constructor)
	// 1. Default 생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}
	// 2. 매개변수있는 생성자
	public Car(String brand, String model, String color, String registerName, int year, int price) {
		super();		
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerName = registerName;
		this.year = year;
		this.price = price;
	}
	
	// 3. getters/setters 메소드
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public String getRegisterName() {
		return registerName;
	}
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color + ", registerName="
				+ registerName + ", year=" + year + ", price=" + price + "]";
	}
	
}
 