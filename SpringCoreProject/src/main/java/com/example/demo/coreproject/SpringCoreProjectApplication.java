package com.example.demo.coreproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringCoreProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringCoreProjectApplication.class, args);
//		SpringApplication.run(SpringCoreProjectApplication.class, args);
		System.out.println("running");
		Person p1 = Context.getBean(Person.class);
//		Laptop lt1 = Context.getBean(Laptop.class);
//		Employee emp1 = Context.getBean(Employee.class);
//		Address addr1 = Context.getBean(Address.class);
//		p1.show();
//		lt1.printBrand();

		Scanner scan = new Scanner(System.in);
		System.out.println("ID: ");
		p1.setId(scan.nextInt());
		System.out.println("Name: ");
		p1.setName(scan.next());
		System.out.println("Title: ");
		p1.setTitle(scan.next());
		System.out.println("Status: ");
		p1.getEmployee().setStatus(scan.next());
		System.out.println("House No: ");
		p1.addr1.setHouseNo(scan.nextInt());
		System.out.println("Street: ");
		p1.addr1.setStreet(scan.next());	
		System.out.println("City: ");
		p1.addr1.setCity(scan.next());
//		scan.nextLine();
		System.out.println("State: ");
		p1.addr1.setState(scan.next());
//
//
		System.out.println("Zipcode: ");
		p1.addr1.setZipcode(scan.nextInt());
		System.out.println("Grade: ");
		p1.getEmployee().setGrade(scan.nextInt());
		System.out.println("Staff Directory" );
		System.out.println("___________________");
		System.out.println("Name: ");
		System.out.println(p1.getName());
		System.out.println("Title: ");
		System.out.println(p1.getTitle());
//		System.out.println("Status: ");
//		System.out.println(emp1.getStatus());
		System.out.println("___________________");
		System.out.println(p1.getAddress());
		System.out.println("Is New York Address?: " + p1.addr1.isNYAddress());
		System.out.println(p1.getEmployee().ages());
		p1.getEmployee().educationLevel();


	}

}
