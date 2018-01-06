

package DatabaseConnections;
import java.sql.*;

public class Viewingdetails {
	public static void main(String[] args)
	{
		
		try
		{
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db","root","root");
			PreparedStatement psmt=con.prepareStatement("select*from studentdetails(?,?,?,?,?,?,?,?)");
			psmt.execute();
			ResultSet rs=psmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
