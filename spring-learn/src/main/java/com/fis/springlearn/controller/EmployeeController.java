package com.fis.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.SpringLearnApplication;
import com.fis.springlearn.service.EmployeeService;

public class EmployeeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	private EmployeeService employeeService;

	public EmployeeController() {
		LOGGER.debug("Inside the Controller constructor");
		
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	
}
