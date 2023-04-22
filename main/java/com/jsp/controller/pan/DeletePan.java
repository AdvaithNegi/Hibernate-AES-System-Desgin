package com.jsp.controller.pan;

import com.jsp.dto.Pan;
import com.jsp.service.PanService;
import com.jsp.service.PersonService;

public class DeletePan {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.deletePerson(7);

		PanService panService = new PanService();
		Pan pan = panService.deletePan(7);
		if (pan != null)
			System.out.println("Pan Record Deleted");
	}
}
