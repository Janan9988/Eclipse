package Database;
import java.sql.*;

public class Insert {
	private static String url = "jdbc:mysql://localhost:3306/Exercise";
	private static String username = "root";
	private static String password = "Tn33A9988.";
	private static String query ="insert into Exercise values(1,'Ram','2.0') ";


	public static void main(String[] args) {
		try {
			
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		int sum=stmt.executeUpdate(query);
		System.out.println("The row insert in the table is "+sum);
		con.close();
		}
		catch(Exception e ){
			
			System.out.println(e);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
