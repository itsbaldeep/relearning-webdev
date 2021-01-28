package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        PrintWriter out = res.getWriter();
        
        // Getting the global parameter through the parameter name
        ServletContext ctx = getServletContext();
        String val = ctx.getInitParameter("example");
        
        // Getting local param from server config
        ServletConfig cfg = getServletConfig();
        String lval = cfg.getInitParameter("example");
        
        out.println(lval);
        out.println(val);

    }

}