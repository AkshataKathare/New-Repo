package com.akshata.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/pmInfo")
public class PMInfo extends HttpServlet {

	public PMInfo() {
		System.out.println("Creating PMInfo using no-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in PMInfo");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in PMInfo");

		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			System.out.println("Header names :" + headerName + "Value :" + req.getHeader(headerName));
		}

		resp.setContentType("text/html");

		String pm = req.getParameter("pmName");

		PrintWriter writer = resp.getWriter();
		writer.print("<html><body><a href='index.html'>Go to link</a></body></html>");
		writer.print("<br>");
		writer.print("PM name :" + pm);

	}

}
