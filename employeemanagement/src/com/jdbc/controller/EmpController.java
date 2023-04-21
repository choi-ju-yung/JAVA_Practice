package com.jdbc.controller;

import java.util.List;

import com.jdbc.model.dto.EmpDTO;
import com.jdbc.model.service.EmpService;
import com.jdbc.view.MainView;

public class EmpController {
	
	private EmpService service = new EmpService();
	private MainView view = new MainView();
	
	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	
	public void selectEmpAll() {
		List<EmpDTO> boards = service.selectEmpAll();
		view.printEmpAll(boards);
	}
}
