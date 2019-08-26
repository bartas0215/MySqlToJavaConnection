package database;

import java.sql.Connection;
import java.sql.DriverManager;



	public class SqlCon {

		
		public static void main(String[] args) throws Exception {

			getConnection(); 
			
		}
				
				 private static Connection getConnection() throws Exception{
					  try{
					
					   
					   Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.2/Dermosan", "bartas", "bartas");
					   System.out.println("Connected");
					   System.out.println();
					   return con;
					  } 
					  catch(Exception e){System.out.println(e);}
					  
					
					  return null;
					 }
				 
				 
				
				 
				 
				 
			}
	
	
	

