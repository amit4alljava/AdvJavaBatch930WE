package com.tcs.shopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null){
			response.sendRedirect("views/login.html");
		}
		else
		{
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
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			session.removeAttribute("userid");
			session.invalidate();
			out.println("U Logout SuccessFully"
					+ " <a href='views/login.html'> "
					+ "Login Again </a>");
					
		}
	}

}
