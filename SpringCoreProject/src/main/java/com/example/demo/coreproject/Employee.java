package com.example.demo.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {
//String title;
private String status;
private double salary;
//@Autowired

//public void setTitle(String title) {
//	this.title = title;
//	
//}
//public String getTitle() {
//	return title;
//}

public void setStatus(String status) {
	this.status = status;
	
}
public String getStatus() {
	return status;
	
}
 public void setSalary(double salary) {
	 this.salary = salary;
 }
 public double getSalary() {
	 return salary;
 }
 
 
}