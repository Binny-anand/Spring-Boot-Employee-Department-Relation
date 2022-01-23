package com.paytm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paytm.demo.model.Department;

public interface DeptRepo extends JpaRepository<Department,Integer>{

}
