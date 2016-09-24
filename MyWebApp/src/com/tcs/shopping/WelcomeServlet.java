package com.tcs.shopping;

import java.io.IOException;
import java.io.PrintWriter;

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
		String uid = (String)session.getAttribute("userid");
			out.println("Welcome  "+uid);
		out.println("Account Summary is ");
		}
		//Date date = new Date();
		//out.println("Hello User ! "+date);
		//out.println("Page Visited "+counter);
		//counter++;
		out.close();
	}

}
