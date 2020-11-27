package com.luv2code.testdb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
    
    public TestDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = "springstudent";
		String password = "springstudent";
		String JdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverClass);
			Connection connection = DriverManager.getConnection(JdbcUrl, username, password);
//			Statement statement = connection.createStatement();
			//Query query = statement.execute("SELECT * FROM customer");
			System.out.println();
			System.out.println();
			System.out.println("Connection Successful");
			System.out.println();
			System.out.println();
			
		}
		catch (Exception e) {
			System.out.println("Connection Failed");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/

}
