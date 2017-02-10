package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Test extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		resp.addHeader("my-header", "xxx1");
		resp.addHeader("my-header", "xxx2");
		
		resp.addIntHeader("Integer", Integer.MAX_VALUE);
		resp.addDateHeader("My-Date", new Date().getTime());
		
		
		out.println("<h1>Test</h1>");
	}
}
