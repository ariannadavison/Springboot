package com.example.demo.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {
//String title;
private String status;
private double salary;
private int grade;
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
 public void setGrade(int grade) {
	 this.grade = grade;
 }
 public int getGrade() {
	 return grade;
 }
 
 public String ages() {
	 return "Ages " + (grade +5) + " and " + (grade +6);
 }
 
 public void educationLevel() {
	 String level;
	 if(grade < 5) {
		 level = "Elementary";
 
	 }
	 else if(grade < 9) {
		 level = "Middle";
	 }
	 else {
		 level = "High School";
	 }
 System.out.println("Education Level: " + level);
 }
 
}