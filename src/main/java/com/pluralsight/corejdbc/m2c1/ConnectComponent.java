package com.pluralsight.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectComponent {
	
	public boolean tryConnection() throws Exception{	

//		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/classicmodels?user=postgres&password=&serverTimezone=UTC")){
		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/conference_app?user=postgres&password=&serverTimezone=UTC")){
				
			return conn.isValid(2);
    				   
		}
    }

}
