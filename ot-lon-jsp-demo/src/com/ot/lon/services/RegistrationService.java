package com.ot.lon.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.ot.lon.models.Person;

public class RegistrationService {
	
	public static final String PATH_TO_FILE = "C:\\Users\\mmonzon\\Documents\\gh\\ot-lon-jsp-demo\\ot-lon-jsp-demo\\WebContent\\data\\persons.txt";
	
	public void savePersonToList(Person person) throws IOException {
				
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_FILE, true));
		
		// TODO fix this
		writer.append(person.toString());
		
		writer.append("\n\n");
		
		writer.close();
		
	}

}
