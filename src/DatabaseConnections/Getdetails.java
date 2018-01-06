package DatabaseConnections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import GetterSetters.Student;

public class Getdetails {
	Connection connection = null;

	public ArrayList setdata() {
		ArrayList al=new ArrayList<>();
		Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				connection=new DBConnection().getconnect();
			
				preparedStatement = connection
						.prepareStatement("select * from studentdetails");
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					al.add(resultSet.getString(1));
					al.add(resultSet.getString(2));
					al.add(resultSet.getString(3));
					al.add(resultSet.getString(4));
					al.add(resultSet.getString(5));
					al.add(resultSet.getString(6));
					al.add(resultSet.getString(7));
					al.add(resultSet.getString(8));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return al;
	}
	
	
}
