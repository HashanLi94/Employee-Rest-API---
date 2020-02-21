package com.springboot.crud.crudemp.dao;

import com.springboot.crud.crudemp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
