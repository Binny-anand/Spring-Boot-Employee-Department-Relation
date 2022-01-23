package com.paytm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paytm.demo.model.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
