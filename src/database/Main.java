package database;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Main {

	
	public static void main(String[] args) throws Exception {

		getConnection(); 
		
	}
			
			 private static Connection getConnection() throws Exception{
				  try{
				
				   
				   Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.2/test3", "bartas", "bartas");
				   System.out.println("Connected");
				   return con;
				  } 
				  catch(Exception e){System.out.println(e);}
				  
				  
				  return null;
				 }
			 
			 
			
			 
			 
			 
		}

	
		
	

