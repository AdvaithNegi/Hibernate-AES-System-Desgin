package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Person savePerson(Person person) {
		if (person != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		return null;
	}

	// Get By Id Record
	public Person getByIDPerson(int id) {
		return entityManager.find(Person.class, id);
	}

	// Update Record
	public Person updatePerson(Person person) {
		if (person != null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			return person;
		}
		return null;
	}

	// Delete Record
	public Person deletePerson(Person person) {
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return person;
		}
		return null;
	}

	// Get All Records
	public List<Person> getAllPersons() {
		String sql = "select p from Person p";
		Query query = entityManager.createQuery(sql);
		List<Person> persons = query.getResultList();

		return persons;
	}

}
