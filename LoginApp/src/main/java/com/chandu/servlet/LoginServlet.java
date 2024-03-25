package com.chandu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		if(username.equals("chandu")&& password.equals("chandu@786"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
		}
		else
		{
			writer.println("login failed..");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		}
	}

}
