package com.jsp.controller.person;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Gayatri");
		person.setEmail("gayatri@mail.com");
		person.setCno("5588446622");

		PersonService personService = new PersonService();
		Person person2 = personService.updatePerson(person, 5);
		if (person2 != null)
			System.out.println("Person Record Updated");
	}
}
