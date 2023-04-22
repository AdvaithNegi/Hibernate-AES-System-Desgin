package com.jsp.controller.person;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class SavePerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("wtf");
		person.setEmail("wtf@mail.com");
		person.setCno("9955771133");

		PersonService personService = new PersonService();
		Person person2 = personService.savePerson(person);
		if (person2 != null)
			System.out.println("Person Record Added");
	}
}
