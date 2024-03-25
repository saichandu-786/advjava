package com.chandu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SendRedirect")
public class SendRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		if(username.equals("chandu") && password.equals("chandu@786"))
		{
			response.sendRedirect("http://www.microsoft.com");
		}
		else
		{
			response.sendError(808,"invalid credentials");
		}
	}

}
