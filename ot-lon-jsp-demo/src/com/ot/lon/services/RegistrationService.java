package com.ot.lon.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.ot.lon.models.Person;

public class RegistrationService {

	public static final String PATH_TO_FILE = "C:\\data\\persons.txt";

	public static final String PIPE = "|";

	public void savePersonToList(Person person) throws IOException {

		if (!person.getFirstName().isEmpty()) {
			BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_FILE, true));

			writer.append(PIPE.concat(person.getFirstName()).concat(PIPE).concat(person.getLastName().concat(PIPE)));
			writer.append("\n");
			writer.close();
		}
	}
}
