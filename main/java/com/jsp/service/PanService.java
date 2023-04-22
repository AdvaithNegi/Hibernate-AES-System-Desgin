package com.jsp.service;

import java.util.List;

import com.jsp.dao.PanDao;
import com.jsp.dto.Pan;
import com.jsp.util.AES;
import com.jsp.util.Constant;

public class PanService {

	PanDao panDao = new PanDao();

	// Save Pan
	public Pan savePan(Pan pan) {
		String pan_no = AES.encrypt(pan.getPan_no(), Constant.key);
		pan.setPan_no(pan_no);

		return panDao.savePan(pan);
	}

	// Get By Id Pan
	public Pan getByIdPan(int id) {
		Pan pan = panDao.getByIdPan(id);
		String pan_no = AES.decrypt(pan.getPan_no(), Constant.key);
		pan.setPan_no(pan_no);
		return pan;
	}

	// Update Pan
	public Pan updatePan(Pan pan, int id) {
		Pan pan2 = panDao.getByIdPan(id);
		if (pan.getPan_no() != null)
			pan2.setPan_no(pan.getPan_no());
		String pan_no = AES.encrypt(pan2.getPan_no(), Constant.key);
		pan2.setPan_no(pan_no);
		return panDao.updatePan(pan2);
	}

	// Delete Pan
	public Pan deletePan(int id) {
		Pan pan = panDao.getByIdPan(id);
		if (pan != null)
			return panDao.deletePan(pan);
		return null;
	}

	// Get All Pans
	public void getAllPans() {
		List<Pan> pans = panDao.getAllPans();
		for (Pan pan : pans) {
			String pan_no = AES.decrypt(pan.getPan_no(), Constant.key);
			pan.setPan_no(pan_no);
			System.out.println("==============================================");
			System.out.println("Pan ID     : " + pan.getId());
			System.out.println("Pan Pan_no : " + pan.getPan_no());
		}
	}
}
