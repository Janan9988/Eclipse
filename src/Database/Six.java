package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Six {
    	private static String url = "jdbc:mysql://localhost:3306/Sar";
		private static String username = "root";
		private static String password = "Tn33A9988.";
		private static String query ="insert into Sar values ('John@gamil.com',7094333')";
		
		public static void main (String []args ) {
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