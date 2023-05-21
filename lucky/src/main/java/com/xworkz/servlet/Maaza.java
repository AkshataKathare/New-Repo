package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maa")
public class Maaza extends HttpServlet {

	public Maaza() {
		System.out.println("Creating Maaza using no-arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service method in Maaza");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in Maaza");

		Enumeration<String> enumeration = req.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();
			System.out.println(req.getHeader(headerName));
		}

		req.getParameter("fname");

		System.out.println("=======================");

		resp.setContentType("text/html");

		PrintWriter respWriter = resp.getWriter();
		respWriter.print("<html><body><h2>Maaza is a mango flavoured juice...</h2></body></html>");

		String remoteAddr = req.getRemoteAddr();
		System.out.println(remoteAddr);
	}
}
