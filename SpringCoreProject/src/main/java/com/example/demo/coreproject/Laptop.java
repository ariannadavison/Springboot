package com.example.demo.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

private String name;
private String brand;
private String operatingsystem;
private int id;
@Autowired



public Laptop() {
	System.out.println("laptop object created");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String getBrand() {
	return brand;

}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setOperatingsystem(String os) {
	this.operatingsystem = os;
}
public String getOperatingsystem() {
	return operatingsystem;
}
public void printBrand() {
	System.out.println("Dell");
}
}
