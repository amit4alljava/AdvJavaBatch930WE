package com.tcs.shopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");
		String password = request.getParameter("password");
		String branchName = request.getParameter("branch");
		if(uid.equals(password)){
			
			boolean isCookieFound = false;
			String mycolor = request.getParameter("favcolor");
			// To get the cookies from the client machine
			Cookie cookies[] = request.getCookies();
			if(cookies!=null && cookies.length>0){
				for(Cookie cookie : cookies){
					if(cookie.getName().
							equalsIgnoreCase("myfavcolor")){
						isCookieFound=true;
					}
				}
			}
			// Create Cookie Code
			if(!isCookieFound){
				Cookie cookie = 
						new Cookie("myfavcolor",mycolor);
				cookie.setMaxAge(365*24*60*60);
				response.addCookie(cookie);
			}
			
			
			// Create a New Session Here
			HttpSession session = request.getSession(true);
			//HttpSession session = request.getSession();
			//if(session.isNew()){
			session.setAttribute("userid", uid);
			//}
			RequestDispatcher rd = request.getRequestDispatcher("welcome.amit");
			rd.forward(request, response);
			//response.sendRedirect("welcome.amit?branch="+branchName);
			//response.sendRedirect("welcome?uid="+uid); //URL Rewriting
			// sendRedirect - 
			//used to redirect from one page to another page
			// sendRedirect doesn't carry the same request/response
			//out.println("Welcome "+uid);
		}
		else
		{
			out.println("Invalid Userid or Password !");
		}
	}

}
