package com.chandu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Step1:Read the data
				int n1=Integer.parseInt(request.getParameter("first"));
				int n2=Integer.parseInt(request.getParameter("second"));
				String operation=request.getParameter("operation");
				//Step2:Process the data
				StringBuffer sb=new StringBuffer();
				
				switch(operation) {
				case"even":for(int i=n1;i<=n2;i++)
				{ 
					if(i%2==0)
					{
						sb.append(i);	
					}
				}
					break;
				case"odd":for(int i=n1;i<=n2;i++) 
				{
					if(i%2!=0) 
					{
						sb.append(i);
					}
				}
					break;
				case "prime" :
					int count;
					for(int i=n1;i<=n2;i++)
					{
						count=0;
						for(int j=2;j<=i;j++)
						{
							if(i%j==0)
							{
								count++;
							}
						}
						if(count==1)
						{
							sb.append(i+" ");
						}
						
					}
					;break;
					
				case "strong" :
					int n,temp,rem,sum,fact;
					for(int i=n1;i<=n2;i++)
					{
						temp=i;
						n=i;
						sum=0;
						while(temp>0)
						{
							rem=temp%10;
							fact=1;
							for(int j=1;j<=rem;j++)
							{
								fact=fact*j;
							}
							sum=fact+sum;
							temp=temp/10;
						}
						if(sum==n)
						{
							sb.append(n+" ");
						}
					}
				
					;break;
				case "perfect": 
					int sum1;
					for(int i=n1;i<=n2;i++)
					{
						sum1=0;
						for(int j=1;j<i;j++)
						{
							if(i%j==0)
							{
								sum1+=j;
							}
						}
						if(sum1==i)
						{
							sb.append(i+" ");
						}
					}
					
				break;


				}
				//Step3:Render the data
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				writer.println("<html>");
				writer.println("<h1>generate numbers..</h1>");
				writer.println("<body bgcolor=magenta>");
				writer.println("<h2>Generate Numbers Result</h2>");
				writer.println("The "+operation+" numbers between "+n1+" and "+n2+" are: "+sb);
				writer.println("</body>");
				writer.println("</html>");
		}

	
}
