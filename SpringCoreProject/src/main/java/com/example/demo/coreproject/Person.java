package com.example.demo.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Person {

private String name;
private String title;

private int id;
@Autowired
@Qualifier("addr1")
public Address addr1;
@Autowired
@Qualifier("emp1")
private Employee emp1;
public Person() {
	System.out.println("object created");
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


public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public String getAddress() {
	return addr1.format();
}
public Employee getEmployee() {
	return emp1;
}

}
