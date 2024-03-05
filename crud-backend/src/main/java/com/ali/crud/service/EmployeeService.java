package com.ali.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.crud.dao.EmployeeDao;
import com.ali.crud.entity.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
    }
    

    public List<Employee> getEmployees(){
        java.util.List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees::add);
        return employees;
    }


    public Employee getEmployeeById(Integer id){
        return employeeDao.findById(id).orElseThrow();
    }

    public void deleteEmployeeById(Integer id){
        employeeDao.deleteById(id);
    }

    public Employee updatEmployee(Employee employee){
        employeeDao.findById(employee.getId()).orElseThrow();
        return employeeDao.save(employee);
    }
}
