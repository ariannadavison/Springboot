package com.example.demo.coreproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;




@Component
public class Datasource {
	String user;
	String password;
	String url;
	Properties props = new Properties();
	FileInputStream fis = null;
	Datasource mysqlDS = null;
	
}