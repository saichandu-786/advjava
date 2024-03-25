package com.chandu.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		
		Cookie[] cookies=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=biege>");
		writer.println("<pre>");
		writer.println("username...."+cookies[0].getValue());
		writer.println("age..."+cookies[1].getValue());
		writer.println("qualification..."+cookies[2].getValue());
		writer.println("designation..."+cookies[3].getValue());
		writer.println("e-mail....."+request.getParameter("email"));
		writer.println("mobile..."+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
