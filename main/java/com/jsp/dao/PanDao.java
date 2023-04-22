package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Pan;

public class PanDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Pan savePan(Pan pan) {
		if (pan != null) {
			entityTransaction.begin();
			entityManager.persist(pan);
			entityTransaction.commit();
			return pan;
		}
		return null;
	}

	// Get By Id Record
	public Pan getByIdPan(int id) {
		return entityManager.find(Pan.class, id);
	}

	// Update Record
	public Pan updatePan(Pan pan) {
		if (pan != null) {
			entityTransaction.begin();
			entityManager.merge(pan);
			entityTransaction.commit();
			return pan;
		}
		return null;
	}

	// Delete Record
	public Pan deletePan(Pan pan) {
		if (pan != null) {
			entityTransaction.begin();
			entityManager.remove(pan);
			entityTransaction.commit();
			return pan;
		}
		return null;
	}

	// Get All Records
	public List<Pan> getAllPans() {
		String sql = "select p from Pan p";
		Query query = entityManager.createQuery(sql);
		List<Pan> pans = query.getResultList();
		return pans;

	}

}
