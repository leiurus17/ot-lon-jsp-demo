package com.ot.lon.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ot.lon.models.Person;
import com.ot.lon.services.RegistrationService;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5701535636951469765L;
	
	private RegistrationService registrationService = new RegistrationService();
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Build the Person object
		Person person = registrationService.buildPerson(request);
		
		// Saving to text file
		registrationService.savePersonToList(person);
		
		request.setAttribute("person",  person);
		RequestDispatcher dispatcher = request.getRequestDispatcher("pages/registration-successful.jsp");
		dispatcher.forward(request, response);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
