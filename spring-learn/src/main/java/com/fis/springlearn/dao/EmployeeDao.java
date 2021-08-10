package com.fis.springlearn.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fis.springlearn.SpringLearnApplication;

@Component 
public class EmployeeDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

 public EmployeeDao() {
	 LOGGER.debug("Inside dao construtor");
 }
}
