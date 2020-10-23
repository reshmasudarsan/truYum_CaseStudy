package com.cognizant.truyum.dao;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ConnectionHandler {

	
	private static Connection connect = null;
	private static Properties property = new Properties();
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
			try{
			
			FileInputStream fileinput = null;
			fileinput = new FileInputStream("truYum/src/connection.properties");
			property.load(fileinput);
			
			// load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
            
	
            String url = null;
			connect = DriverManager.getConnection(url,"root","iscream4icecream");
	    }
	    catch(IOException e){
	        System.out.println("Connection not established");
	        System.out.println(e);
	    }
		return connect;	
		
	}
}
