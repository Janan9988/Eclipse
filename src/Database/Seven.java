package Database;
import java.sql.*;

public class Seven{
	private static String url = "jdbc:mysql://localhost:3306/Sar";
   private static String username = "root";
    private static String password = "Tn33A9988.";
    private static String query="Select * from Sar";
    
	public static void main(String[] args) {
		
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {

			System.out.println(rs.getInt(1) );
		}
			con.close();
		
		}
		 
	 catch (Exception e) {
		System.out.println(e);
	 }
		
	}

}
