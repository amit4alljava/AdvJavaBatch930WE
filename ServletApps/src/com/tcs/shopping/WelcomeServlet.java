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

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private int counter=1;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// How to Print Output on Client Browser
		//String uid = request.getParameter("uid");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		int x= 100/0;
		//RequestDispatcher rd = request.getRequestDispatcher("SessionServlet");
		//rd.include(request, response);
//		if(session==null){
//			response.sendRedirect("views/login.html");
//		}
//		else{
			String mycolor = "white";
			Cookie cookies[] = request.getCookies();
			if(cookies!=null && cookies.length>0){
				for(Cookie cookie : cookies){
					if(cookie.getName().
							equalsIgnoreCase("myfavcolor")){
						mycolor = cookie.getValue();
					}
				}
			}
		out.println("<html>"
				+ ""
				+ "<body bgcolor='"+mycolor+"'>");	
		String uid = (String)session.getAttribute("userid");
		int loginUserCount = SessionCountListener.getCounter();
			out.println("Welcome  "+uid+" Login Users are "+loginUserCount);
		out.println("Account Summary is "+request.getParameter("branch"));
		out.println("<script> document.body.style.backgroundColor=localStorage.favcolor;alert('Color is '+localStorage.favcolor);</script></body></html>");
		//}
		//Date date = new Date();
		//out.println("Hello User ! "+date);
		//out.println("Page Visited "+counter);
		//counter++;
		out.close();
	}

}
