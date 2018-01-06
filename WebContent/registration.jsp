<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATIN PAGE</title>
</head>
<body>
<div align="center">
<div style = "background-color:navy;color:white;float:right;height:23%;width:89.5%"><h1 >SANTOSHIMATHA TYPE WRITING INSTITUTE<br>RAMAGIRI, NALGONDA<br>ph:no 9912255960</h1></div>
</div>
<img src="images/santoshie.jpg"  width="10%" height="150px" />
<div style="background-color:#6D1A08;height:550px;width:23%;float:left"><br><br><br>
	<div style="padding-left: 7px">
<a href="home.jsp"> <font color="white" size="6"><u><i>HOME</i></u></font></a><br><br><br>
<a href="adminlogin.jsp" ><font color="white" size="6"><u><i>ADMIN LOGIN</i></u></font></a><br><br><br>
<a href="registration.jsp"><font color="white" size="6"><u><i>REGISTRATION</i></u></font></a><br><br><br>
<a href="aboutus.jsp"><font color="white" size="6"><u><i>ABOUT US</i></u></font></a><BR><BR><BR>
<a href="contactus.jsp"><font color="white" size="6"><u><i>CONTACT US</i></u></font></a><br><br><br>
		<a href="viewstudent.jsp"><font color="white" size="6"> <u><i>VIEW REGISTERED</i></u></font></a>

</div>
</div>
<div style="background-color:grey;height:550px;width:23%;float:right"></div>
<a></a>
<br><br><br>
<h1 style="text-align:center;color:red;">ENTER STUDENT DETAILS</h1>
	<form action="Registration" method="post">
		<table align="center">
		<tr><td><b>FIRST NAME:</td><td><input type="text" name="fname" placeholder="firstname" ></td></tr>
		<tr><td><b><br>LAST NAME:</td><td><br><input type="text" name="lname" placeholder="lastname"></td></tr>
		<tr><td><b><br>PLACE:</td><td><br><input type="text" name="place" placeholder="location"></td></tr>
		<tr><td><b><br>DISTRICT:</td><TD><br><input type="text" name="district" placeholder="district name"></TD></tr>
		<tr><td><b><br>PINCODE:</td><TD><br><input type="number" name="pin" placeholder="pincode"></TD></tr>
		<tr><td><b><br>MOBILENUMBER:</td><TD><br><input type="number" name="mobile" placeholder="phonenumber"></TD></tr>
		<tr><td><b><br>EMAILID:</td><TD><br><input type="email" name="email" placeholder="emailid"></TD></tr>
		<tr><td><b><br>GENDER:</b></td><td><br><input type="radio" name="gender" value="male" checked>Male<input type="radio" name="gender" value="female">Female</td></tr>
		<tr><td></td><td><br><input type="submit" value="REGISTER"></td></tr>
		</table>
	</form>
</body>
</html>