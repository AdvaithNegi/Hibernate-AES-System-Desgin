package com.jsp.controller.pan;

import com.jsp.dto.Pan;
import com.jsp.service.PanService;

public class UpdatePan {

	public static void main(String[] args) {

		Pan pan = new Pan();
		pan.setPan_no("AD04VAI14TH21");

		PanService panService = new PanService();
		Pan pan2 = panService.updatePan(pan, 4);
		if (pan2 != null)
			System.out.println("Pan Record Updated");
	}
}
