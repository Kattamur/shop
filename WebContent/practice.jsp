<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet"%>
<%@page import= "java.sql.Statement"%>
<%@page import="java.sql.Connection" %>
<%
String id=request.getParameter("userId");
String driverName="com.jdbc.mysql.driver";
String connectionurl="jdbc:mysql://localhost:3306/shop_db";
String dbname="shop_db";
String  userId="root";
String password="root";
try
{
	Class.forName(driverName);
}
catch(Exception e)
{
	e.printStackTrace();
}

Connection connection=null;
Statement statement=null;
ResultSet resultSet=null;
%>
<h1 align="center">REGISTERED STUDENTS</h1>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="blue">
<td><b>FIRSTNAME</b></td>
<td><b>LASTNAME</b></td>
<td><b>PLACE</b></td>
<td><b>DISTRICT</b></td>
<td><b>PINCODE</b></td>
<td><b>PHONENO</b></td>
<td><b>EMAILID</b></td>
<td><b>GENDER</b></td>
</tr>
<% 
try{
	connection = DriverManager.getConnection(connectionurl,userId,password);  
	statement =connection.createStatement();
	String sql="select*from studentdetails";
	
	resultSet=statement.executeQuery(sql);
	while(resultSet.next()){
%>
<tr bgcolor="#00FF00">

<td><%=resultSet.getString("firstname") %></td>
<td><%=resultSet.getString("lastname") %></td>
<td><%=resultSet.getString("place") %></td>
<td><%=resultSet.getString("district") %></td>
<td><%=resultSet.getInt("pincode") %></td>
<td><%=resultSet.getString("phoneno") %></td>
<td><%=resultSet.getString("emailid") %></td>
<td><%=resultSet.getString("gender") %></td>
</tr>


<%
}
	connection.close();
}catch(Exception e){ 
e.printStackTrace();
}
%>
</table>
</html>