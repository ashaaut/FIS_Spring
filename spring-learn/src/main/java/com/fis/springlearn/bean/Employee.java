package com.fis.springlearn.bean;

import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.SpringLearnApplication;

public class Employee {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	
	int id;
	String name;
	double salary;
	boolean permanant;
	Date dateOfBirth;
	Department department;
	 Skill[] skill;
	public Skill[] getSkill() {
		return skill;
	}

	public void setSkill(Skill[] skill) {
		this.skill = skill;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		LOGGER.debug("Inside Employee Constructor");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanant() {
		return permanant;
	}
	public void setPermanant(boolean permanant) {
		this.permanant = permanant;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanant=" + permanant
				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skill=" + Arrays.toString(skill)
				+ "]";
	}
	
}
