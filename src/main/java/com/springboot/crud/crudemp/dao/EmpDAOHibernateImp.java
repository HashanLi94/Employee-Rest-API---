package com.springboot.crud.crudemp.dao;

import com.springboot.crud.crudemp.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmpDAOHibernateImp implements EmployeeDAO {
    //define the field for entity manager
    private EntityManager entityManager;

    //entity manager injects to the dao
    @Autowired
    public EmpDAOHibernateImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        //get the current hibernate session
        Session currentSesseion = entityManager.unwrap(Session.class);

        //create the query
        Query <Employee> = currentSesseion.createQuery("from employee", Employee.class);

        //execute the query
        List<Employee> employees = theQuery.getResultList();

        //get the results
        return employees;
    }
}
