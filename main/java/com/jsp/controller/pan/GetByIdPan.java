package com.jsp.controller.pan;

import com.jsp.dto.Pan;
import com.jsp.service.PanService;

public class GetByIdPan {

	public static void main(String[] args) {

		PanService panService = new PanService();
		Pan pan = panService.getByIdPan(4);

		System.out.println("Pan ID     : " + pan.getId());
		System.out.println("Pan Pan_no : " + pan.getPan_no());
	}
}
