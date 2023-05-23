package com.akshata.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/country")
public class CountryInfo extends HttpServlet {

	public CountryInfo() {
		System.out.println("Creating CountryInfo using no-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in CountryInfo");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in CountryInfo");

		String remoteAddr = req.getRemoteAddr();
		System.out.println("remote address :" + remoteAddr);

		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			System.out.println("headerName :" + headerName + "Header value :" + req.getHeader(headerName));
		}

		System.out.println("===============");

		String country = req.getParameter("countryName");
		String countryCode = req.getParameter("countryCode");
		String capitalCity = req.getParameter("capitalCity");
		String population = req.getParameter("population");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 style='color:blue'>");
		writer.print("Country Info");
		writer.print("</h1>");
		writer.print(country);
		writer.print("<br>");
		writer.print(countryCode);
		writer.print("<br>");
		writer.print(capitalCity);
		writer.print("<br>");
		writer.print(population);
		writer.print("<br>");
		System.out.println("Enter Prime Minister Name");
		writer.print("<br>");
		writer.print("<form method='get' action='pmInfo'>");
		writer.print("PM Name:");
		writer.print("<input type='text' name='pmName'>");
		writer.print("<input type='submit' value='PMInfo'/>");
		writer.print("</form>");
		writer.print("<br>");
		writer.print("</body>");
		writer.print("</html>");

	}

}
