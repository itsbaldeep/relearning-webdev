package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// This is a servlet class made for handling request on /add
public class AddServlet extends HttpServlet {
	
	// This is the service method take deals with requests and responses
	// We also have doGet() and doPost() methods to deal exclusively for get and post requests
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// We take the two parameter taken from the client side
		int i = Integer.parseInt(req.getParameter("firstNum"));
		int j = Integer.parseInt(req.getParameter("secondNum"));
		
		// We add them and write them in response
		int k = i + j;
		PrintWriter out = res.getWriter();
		out.println(k);
		
	}
}
