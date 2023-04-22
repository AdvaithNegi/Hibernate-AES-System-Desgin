package com.jsp.controller.person;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class DeletePerson {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		Person person = personService.deletePerson(6);
		if (person != null)
			System.out.println("Person Record Deleted");
	}

}
