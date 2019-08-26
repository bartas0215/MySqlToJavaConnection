package database;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class SqlCon1 { 
		public static void main(String[] args) {
			
		
		
		try {
			   //connection to database
			   Connection myConn = DriverManager.getConnection("jdbc:mysql://192.168.1.2/Dermosan", "bartas", "bartas");
			   
			   //create statement 
			   Statement myStmt = myConn.createStatement();
			   
			   //execute sql query
			   ResultSet myRs = myStmt.executeQuery("select * from Ceny");
			   
			   //results set
			   while (myRs.next()) {
			    System.out.println(myRs.getInt("id")+ " , "+myRs.getString("name")+ " , "+myRs.getInt("price"));
			   }
			  }
			  catch (Exception exc) {
			   exc.printStackTrace();
			  }

	}
	}

