package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;
import com.jsp.util.AES;
import com.jsp.util.Constant;

public class PersonService {

	PersonDao personDao = new PersonDao();

	// Save Person
	public Person savePerson(Person person) {
		String email = AES.encrypt(person.getEmail(), Constant.key);
		String cno = AES.encrypt(person.getCno(), Constant.key);
		person.setEmail(email);
		person.setCno(cno);
		return personDao.savePerson(person);
	}

	// Get By Id Person
	public Person getByIdPerson(int id) {
		Person person = personDao.getByIDPerson(id);
		String email = AES.decrypt(person.getEmail(), Constant.key);
		String cno = AES.decrypt(person.getCno(), Constant.key);
		person.setEmail(email);
		person.setCno(cno);
		return person;
	}

	// Update Person
	public Person updatePerson(Person person, int id) {
		Person person2 = personDao.getByIDPerson(id);
		if (person.getName() != null)
			person2.setName(person.getName());
		if (person.getEmail() != null)
			person2.setEmail(person.getEmail());
		if (person.getCno() != null)
			person2.setCno(person.getCno());
		String email = AES.encrypt(person2.getEmail(), Constant.key);
		String cno = AES.encrypt(person2.getCno(), Constant.key);
		person2.setEmail(email);
		person2.setCno(cno);
		return personDao.updatePerson(person2);
	}

	// Delete Person
	public Person deletePerson(int id) {
		Person person = personDao.getByIDPerson(id);
		if (person != null)
			return personDao.deletePerson(person);
		return null;

	}

	// Get All Persons
	public void getAllPersons() {
		List<Person> persons = personDao.getAllPersons();
		for (Person person : persons) {
			String email = AES.decrypt(person.getEmail(), Constant.key);
			String cno = AES.decrypt(person.getCno(), Constant.key);
			person.setEmail(email);
			person.setCno(cno);

			System.out.println("=============================================================");
			System.out.println("Person ID    :" + person.getId());
			System.out.println("Person Name  :" + person.getName());
			System.out.println("Person Email :" + person.getEmail());
			System.out.println("Person CNo   :" + person.getCno());
		}

	}
}
