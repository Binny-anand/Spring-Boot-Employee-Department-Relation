package com.paytm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.demo.dao.DeptRepo;
import com.paytm.demo.dao.EmpRepo;
import com.paytm.demo.model.Department;
import com.paytm.demo.model.Employee;


@RestController
public class MainController {
	
	
	@Autowired
	EmpRepo emp_repo;
	
	@Autowired
	DeptRepo dept_repo;
	
	
	//CURD OPERATIONS FOR EMPLOYEE
	
	@PostMapping("/employee")
	public Employee addEmployee( @RequestBody Employee employee)
	{
		
		emp_repo.save(employee);
		return employee;

	}
	
	@GetMapping("employee")
	@ResponseBody
	public List<Employee> getEmployees()
	{
		
		return emp_repo.findAll();

	}
	

	@DeleteMapping("/employee/{eId}")
	public String deleteEmployee(@PathVariable int eId)
	{
		Employee e=emp_repo.getById(eId);
		emp_repo.delete(e);
		return "Deleted";
		
		
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		
		emp_repo.save(employee);
		return employee;

	}
	
	
	//CURD operation for department
	
	@PostMapping("/department")
	public Department addDepartment( @RequestBody Department department)
	{
		
		dept_repo.save(department);
		return department;

	}
	
	@GetMapping("/department")
	@ResponseBody
	public List<Department> getDepartments()
	{
		return dept_repo.findAll();

	}
	
	@DeleteMapping("/department/{deptId}")
	public String deleteDepartment(@PathVariable int deptId)
	{
		Department e=dept_repo.getById(deptId);
		dept_repo.delete(e);
		return "Deleted";
		
		
	}
	
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department department)
	{
		
		dept_repo.save(department);
		return department;

	}
	
	
	
}
