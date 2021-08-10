package com.fis.springlearn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.SpringLearnApplication;
import com.fis.springlearn.dao.EmployeeDao;

public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		LOGGER.debug("Inside service constructor");
	}

	

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
