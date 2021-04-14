package com.sm.qy28.service;

import com.sm.qy28.entity.Employee;

import java.util.List;

public interface EmployeeService {



    List<Employee> FindAll();

    Employee FindById(Long id);

    void add(Employee employee);

    void update(Employee employee);

    void delete(Long id);

    Boolean selectByemail(String email);
}
