package DatabaseConnections;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getconnect(){
		java.sql.Connection connection=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db","root","root");  
		}catch(Exception e){ 
			System.out.println(e);
		} 
		return connection;
	}
}


