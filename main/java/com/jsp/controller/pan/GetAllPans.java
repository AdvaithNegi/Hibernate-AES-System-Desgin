package com.jsp.controller.pan;

import com.jsp.service.PanService;

public class GetAllPans {

	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.getAllPans();

	}
}
