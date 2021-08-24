package main;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

import DatabaseConnections.InsertDetails;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")


	

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//bitbucket testing
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String place=request.getParameter("place");
		String district=request.getParameter("district");
		String pincode=request.getParameter("pin");
		String phoneno= request.getParameter("mobile");
		String emailid=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		new InsertDetails().insert(firstname,lastname,place,district,pincode,phoneno,emailid,gender);
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		response.sendRedirect("sucessfull.html");
}

}
