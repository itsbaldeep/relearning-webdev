package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// Getting the attribute passed down from other method using Request Dispatcher
		// int k = (int) req.getAttribute("sum");
		
		// Getting the value from parameters using session
		// HttpSession session = req.getSession();
		// int k = (int) session.getAttribute("sum");
		
		// Getting the value from cookies
		int k = 0;
		Cookie[] cs = req.getCookies();
		for (Cookie c : cs) 
			if (c.getName().equals("sum")) k = Integer.parseInt(c.getValue());
		
		// Printing the square of the sum
		PrintWriter out = res.getWriter();
		out.println(k * k);
		
	}
	
}
