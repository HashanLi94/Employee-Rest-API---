package com.springboot.crud.crudemp.controller;

import com.springboot.crud.crudemp.dao.EmpDAOHibernateImp;
import com.springboot.crud.crudemp.dao.EmployeeDAO;
import com.springboot.crud.crudemp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //to inject the dao
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    //expose "/employees" and return list of employee
    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }



}
