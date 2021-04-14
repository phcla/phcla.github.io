package com.sm.qy28.service.Impl;

import com.sm.qy28.entity.Employee;
import com.sm.qy28.mapper.EmployeeMapper;
import com.sm.qy28.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> FindAll() {
        return employeeMapper.FindAll();
    }

    @Override
    public Employee FindById(Long id) {
        return employeeMapper.FindById(id);
    }

    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }

    @Override
    public Boolean selectByemail(String email) {
        Employee employee = employeeMapper.selectByEmail(email);
        if(employee!=null){
            return true;
        }
        return false;
    }
}
