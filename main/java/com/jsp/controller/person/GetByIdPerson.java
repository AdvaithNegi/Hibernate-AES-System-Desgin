package com.jsp.controller.person;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetByIdPerson {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		Person person = personService.getByIdPerson(4);

		System.out.println("Person ID    : " + person.getId());
		System.out.println("Person Name  : " + person.getName());
		System.out.println("Person Email : " + person.getEmail());
		System.out.println("Person Cno   : " + person.getCno());
	}
}
