package Database;
import java.sql.*;

public class ADV_Jdbc{
	private static String url = "jdbc:mysql://localhost:3306/details";
   private static String username = "root";
    private static String password = "Tn33A9988.";
    private static String query="Select * from details";
    
	public static void main(String[] args) {
		
			
		try {
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		}
			con.close();
		
		}
		
	 catch (Exception e) {
		System.out.println(e);
	 }
		
	}

}
