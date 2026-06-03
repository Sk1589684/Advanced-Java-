package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String password = request.getParameter("passwd");

		if (uname.equals("admin1") && password.equals("admin1")) {
			out.println("you are admin");
		} else if (uname.equals("user1") && password.equals("user1")) {
			out.println("you are user");
		} else {
			out.println("invalid credentials");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}
}