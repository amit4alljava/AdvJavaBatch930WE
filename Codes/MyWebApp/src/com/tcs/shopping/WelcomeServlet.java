package com.tcs.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private int counter=1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// How to Print Output on Client Browser
		//String uid = request.getParameter("uid");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		if(session==null){
			response.sendRedirect("views/login.html");
		}
		else{
			response.setHeader("Expires", "0");

			  // Set standard HTTP/1.1 no-cache headers.
			  response.setHeader("Cache-Control"
					  , "no-store, no-cache, must-revalidate");

			  // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
			  response.addHeader("Cache-Control",
					  "post-check=0, pre-check=0");

			  // Set standard HTTP/1.0 no-cache header.
			  response.setHeader("Pragma",
					  "no-cache");
		session.setMaxInactiveInterval(60*5);
			String uid = (String)session.getAttribute("userid");
			response.setContentType("text/html");
			out.println("<html><body>");
			out.println("Welcome  "+uid);
		out.println("Account Summary is ");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = headerNames.nextElement();
			out.println("Header Name ::  "
			+headerName+" Value :: "+
					request.getHeader(headerName)+"<br>");
		}
		//response.sendRedirect("logout.html");
		String urlWithSessionId = response.encodeURL("logout");
		//out.println("<form action='logout'>");
		out.println("<form action='"+urlWithSessionId+"'>");
		out.println("<input type='submit' value='Logout'>");
		out.println("</form></body></html>");
		
		}
		//Date date = new Date();
		//out.println("Hello User ! "+date);
		//out.println("Page Visited "+counter);
		//counter++;
		out.close();
	}

}
