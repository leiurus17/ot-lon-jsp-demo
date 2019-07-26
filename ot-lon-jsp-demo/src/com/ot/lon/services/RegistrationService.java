package com.ot.lon.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.ot.lon.models.Person;

public class RegistrationService {
	
	public static final String PATH_TO_FILE = "C:\\Users\\mmonzon\\Documents\\gh\\ot-lon-jsp-demo\\ot-lon-jsp-demo\\WebContent\\data\\persons.txt";
	public static final String PIPE = "|";
	
	public void savePersonToList(Person person) throws IOException {
				
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_FILE, true));
		
		// TODO fix this
		writer.append(PIPE.concat(person.getFirstName()).concat(PIPE)
				.concat(person.getLastName().concat(PIPE)));
		
		writer.append("\n\n");
		
		writer.close();
		
	}
	
	public Person buildPerson(HttpServletRequest request) {
		
		String firstName    = request.getParameter("first_name");
		String lastName     = request.getParameter("last_name");
		String birthDate    = request.getParameter("birthdate");
		String age          = request.getParameter("age");
		String gender       = request.getParameter("gender");
		String addressLine1 = request.getParameter("address_line_1");
		String addressLine2 = request.getParameter("address_line_2");
		String city         = request.getParameter("city");
		String country      = request.getParameter("country");
		String mobileNumber = request.getParameter("mobile_number");
		
		return new Person(firstName, lastName, birthDate, age, gender, addressLine1, addressLine2, city, country, mobileNumber);
	}

}
