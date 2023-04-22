package com.jsp.controller.pan;

import com.jsp.dto.Pan;
import com.jsp.dto.Person;
import com.jsp.service.PanService;
import com.jsp.service.PersonService;

public class SavePan {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		Person person = personService.getByIdPerson(7);

		Pan pan = new Pan();
		pan.setPan_no("SE12JA45L");
		pan.setPerson(person);

		PanService panService = new PanService();
		Pan pan2 = panService.savePan(pan);
		if (pan2 != null)
			System.out.println("Pan Record Added");
	}
}
