package com.fis.springjpa.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	 @PostMapping(path="/add")
	 public @ResponseBody String addNewEmp(@RequestParam int id
		      , @RequestParam String name) {
		 
		 Employee employee=new Employee();
		 employee.setId(id);
		 employee.setName(name);
		 employeeRepository.save(employee);
		 return "saved";
	 }
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employee>getAllEmployee(){
		return employeeRepository.findAll();
		
	}
	
}
