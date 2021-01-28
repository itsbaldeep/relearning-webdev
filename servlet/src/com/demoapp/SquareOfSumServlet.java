package com.demoapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// This is a servlet class for /squareOfSum
public class SquareOfSumServlet extends HttpServlet {
	
	// The service method for this class
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Getting the two parameters and adding them
		int a = Integer.parseInt(req.getParameter("firstNum"));
		int b = Integer.parseInt(req.getParameter("secondNum"));
		int sum = a + b;
		
		// Setting the parameters as arguments and calling /square using request dispatcher
		// Request Dispatcher is used to call other servlets internally in a server
		
		// req.setAttribute("sum", a + b);
		// RequestDispatcher rd = req.getRequestDispatcher("square");
		// rd.forward(req, res);
		
		// Another way to do it using sendRedirect()
		// using URL rewriting
		// res.sendRedirect("square/?sum=" + sum);
		
		// using sessions
		// HttpSession session = req.getSession();
		// session.setAttribute("sum", sum);
		// res.sendRedirect("square");
		
		// using cookies
		Cookie c = new Cookie("sum", String.valueOf(sum));
		res.addCookie(c);
		res.sendRedirect("square");
		
	}
}
