package com.chandu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    //read the form data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		 String gender=request.getParameter("gender");
		 String dob=request.getParameter("dob");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		String country=request.getParameter("country");
		String[] qual=request.getParameterValues("qualification");
		String[] lang=request.getParameterValues("language");
		String comment=request.getParameter("comment");
		   // process the data
		
		String q=String.join(",", qual);
		String l=String.join(",", lang);
		

		//Step3:Render the data
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<h1>registration form..</h1>");
		writer.println("<body bgcolor=biege>");
		writer.println("username:...."+username);
		writer.println("<br><br>");
		writer.println("password:...."+password);
		writer.println("<br><br>");
		writer.println("gender:..."+gender);
		writer.println("<br><br>");
		writer.println("dob:....."+dob);
		writer.println("<br><br>");
		writer.println("phn no:"+phone);
		writer.println("<br><br>");
		writer.println("email id:......"+email);
		writer.println("<br><br>");
		writer.println("nationality:....."+country);
		writer.println("<br><br>");
		writer.println("qualification:...."+q);
		writer.println("<br><br>");
		writer.println("languages known:....."+l);
		writer.println("<br><br>");
		writer.println("my comments:......"+comment);
		writer.println("<br><br>");
		writer.println("<h2>Registerd succesfully...</h2>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
