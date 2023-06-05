package com.xworkz.jdbcIntegration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbcIntegration.dto.EducationDTO;
import com.xworkz.jdbcIntegration.repository.EducationRepo;
import com.xworkz.jdbcIntegration.repository.EducationRepoImpl;
import com.xworkz.jdbcIntegration.service.EducationService;
import com.xworkz.jdbcIntegration.service.EducationServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/click")
public class EducationController extends HttpServlet {

	public EducationController() {
		System.out.println("Creating EducationController using no-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method in EducationController");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method in Education");

		String name = req.getParameter("fName");
		String schoolName = req.getParameter("schoolName");
		String schlPerc = req.getParameter("schoolPerc");
		String puCollege = req.getParameter("puCollegeName");
		String puPerc = req.getParameter("puPerc");
		String degreeCollege = req.getParameter("degreeCollege");
		String degreePerc = req.getParameter("degreePerc");

		EducationDTO edu = new EducationDTO(name, schoolName, schlPerc, puCollege, puPerc, degreeCollege, degreePerc);

		EducationRepo educationRepo = new EducationRepoImpl();

		EducationService educationService = new EducationServiceImpl(educationRepo);

		try {
			boolean saved = educationService.validateAndThenSave(edu);
			System.out.println("DTO saved :" + saved);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		req.setAttribute("name", name);
		req.setAttribute("schlName", schoolName);
		req.setAttribute("schPerc", schlPerc);
		req.setAttribute("puCollegeName", puCollege);
		req.setAttribute("puPerc", puPerc);
		req.setAttribute("degreeClgName", degreeCollege);
		req.setAttribute("degreePerc", degreePerc);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Display.jsp");
		dispatcher.forward(req, resp);
	}

}
