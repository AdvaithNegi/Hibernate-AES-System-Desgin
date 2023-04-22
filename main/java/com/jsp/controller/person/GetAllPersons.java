package com.jsp.controller.person;

import com.jsp.service.PersonService;

public class GetAllPersons {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.getAllPersons();

	}
}
