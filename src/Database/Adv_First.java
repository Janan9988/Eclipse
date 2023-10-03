package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Adv_First {
	
	private static  String url ="jdbc:mysql://localhost:3306/Exercise";
	private static String username ="root";
	private static String password ="Tn33A9988.";
	private static String query  ="Select * from Exercise";
	
	
	

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt =con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
		}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
		
	}


