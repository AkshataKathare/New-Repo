package com.xworkz.servletJsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/dharwad")
public class Details extends HttpServlet{
	
	public Details() {
		System.out.println("Creating Details using no-arg const");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in Details");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method in Details class");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
		requestDispatcher.forward(req, resp);
	}

}
