package com.fis.springlearn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fis.springlearn.SpringLearnApplication;
import com.fis.springlearn.dao.EmployeeDao;


@Component 
public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		LOGGER.debug("Inside service constructor");
	}

	
	 @Autowired 
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
