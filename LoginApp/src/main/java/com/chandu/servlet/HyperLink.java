package com.chandu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HyperLink")
public class HyperLink extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		if(username.equals("chandu")&& password.equals("chandu@786"))
		{
			writer.println("login success <br>");
			writer.println("<a href='http://www.tcs.com'>click here to open website</a>");
		}
		else
		{
			writer.println("login failed <br>");
			writer.println("<a href='Login.html'>click here to open loginform</a>");
		}
	}

}
