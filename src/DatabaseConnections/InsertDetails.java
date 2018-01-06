package DatabaseConnections;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class InsertDetails 
{
	Connection connection=null;
	
	public void insert(String firstname, String lastname, String place, String district, String pincode, String phoneno, String emailid, String gender){
		try{
		connection=new DBConnection().getconnect();
		
		   java.sql.PreparedStatement psmt=connection.prepareStatement("insert into studentdetails values(?,?,?,?,?,?,?,?);");
		   psmt.setString(1,firstname);
		   psmt.setString(2,lastname);
		   psmt.setString(3, place);
		   psmt.setString(4, district);
		   psmt.setString(5, pincode);
		   psmt.setString(6, phoneno);
		   psmt.setString(7, emailid);
		   psmt.setString(8, gender);
		   psmt.execute();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		}
	}
