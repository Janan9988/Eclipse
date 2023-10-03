package Database;

import java.sql.*;

public class Delete {
	public static void update()throws Exception {
		
	
 String url="jdbc:mysql://localhost3306/Exercise";
 String username = "root";
 String password="Tn33A9988";

	
	int id = 5;
	String query= "delete from employee where Exercise_id : "+id;
	Connection con = DriverManager.getConnection(url, username, password);
	Statement stmt = con.createStatement();
	int sum=stmt.executeUpdate(query);
	System.out.println("Number of rows affteced :"+sum);
		
	con.close();	
		
	}

}
