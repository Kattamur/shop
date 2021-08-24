package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DatabaseConnections.Getdetails;
import GetterSetters.Student;

/**
 * Servlet implementation class Viewstudents
 */
@WebServlet("/Viewstudents")
public class Viewstudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//this is void method
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList al=new Getdetails().setdata();
		request.setAttribute("al", al);
		request.getRequestDispatcher("viewstudent.jsp").forward(request, response);
		
	}
}
