package com.ali.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ali.crud.entity.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    
} 