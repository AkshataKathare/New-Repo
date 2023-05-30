package com.xworkz.fav;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class Favorite extends HttpServlet {

	public Favorite() {
		System.out.println("Creating Favorite using no-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in Favorite");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method in Favorite");

		req.setAttribute("favouriteFood", req.getParameter("favFood"));
		req.setAttribute("favouritePlace", req.getParameter("favPlace"));
		req.setAttribute("favoritePerson", req.getParameter("favPerson"));

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("favoPerson", req.getParameter("favPerson"));

		String[] laptopBrands = { "Asus", "hp", "Dell" };

		req.setAttribute("laptop1", laptopBrands[0]);
		req.setAttribute("laptop2", laptopBrands[1]);
		req.setAttribute("laptop3", laptopBrands[2]);

		ServletContext context = req.getServletContext();
		context.setAttribute("Bank", "Bank Of India");

		Cookie cookiee = new Cookie("Xworkz", String.valueOf(Math.random()));
		
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("Cookie name :" + cookie.getName() + " " + "Cookie value :" + cookie.getValue());
		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("InfoDisplay.jsp");
		requestDispatcher.forward(req, resp);
	}
}
