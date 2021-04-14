package com.sm.qy28.mapper;

import com.sm.qy28.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeMapper {


    @Select("Select * from employee")
    List<Employee> FindAll();

    @Select("Select * from employee where employee_id=#{id}")
    Employee FindById(Long id);

    @Insert("Insert into employee(employee_name,employee_img,employee_email,employee_dept,employee_time) values (#{employeeName},#{employeeImg},#{employeeEmail},#{employeeDept},#{employeeTime})")
    void add(Employee employee);

    @Update("update employee set employee_name=#{employeeName},employee_img=#{employeeImg},employee_email=#{employeeEmail},employee_dept=#{employeeDept},employee_time=#{employeeTime} where employee_id=#{employeeId}")
    void update(Employee employee);

    @Delete("delete from employee where employee_id=#{id}")
    void delete(Long id);

    @Select("Select * from employee where employee_email=#{email}")
    Employee selectByEmail(String email);
}
