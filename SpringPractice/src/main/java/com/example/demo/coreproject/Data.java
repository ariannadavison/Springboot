package com.example.demo.coreproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.sql.DataSource;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Properties;
//
//import javax.sql.DataSource;

//@Entity



//@Component
public class Data {
	public static void main(String[] args) throws SQLException {
//	@Id
//@GeneratedValue(strategy=GenerationType.AUTO)

//private int id;
//private String name;
//private char gender;

	java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newwords");   // For MySQL only
	  java.sql.Statement stmt = conn.createStatement();
String str = "SELECT newwords;";
ResultSet result = stmt.executeQuery(str);

try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//System.out.println("Total number of records = " + rowCount);
System.out.println(result);
//}
//
//private static Connection getConnection(String url) {
//	// TODO Auto-generated method stub
//	
//	return url;
//}
//		this.user = prop;
	
	
//}
//}
}
}