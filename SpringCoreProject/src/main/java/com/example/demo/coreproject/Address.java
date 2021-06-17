package com.example.demo.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("addr1")
public class Address {

private String street;
private int zipcode;
private String state;
private int houseNo;
private String city;
//@Autowired
//@Qualifier("lap1")

public Address() {
	System.out.println("object created");
}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}


public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public void setCity(String city) {
	this.city = city;
}
public String getCity() {
	return city;
}
public void setState(String state) {
	this.state = state;
}
public String getState() {
	return state;
}
public String format() {
char carraige = 13;
	return "Address:" + carraige + this.houseNo + " " + this.street + " Street" +  carraige + this.city + ", " + this.state +", " + carraige + this.zipcode;
}
public boolean isNYAddress() {
	return this.zipcode > 1000 &&  this.zipcode < 14976;
		
	
	
}
}
