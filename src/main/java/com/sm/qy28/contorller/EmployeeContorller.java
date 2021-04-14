package com.sm.qy28.contorller;

import com.sm.qy28.entity.Employee;
import com.sm.qy28.service.EmployeeService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeContorller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> finAll(){
        return employeeService.FindAll();
    }

    @GetMapping("{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.FindById(id);
    }

    @PostMapping
    public String add(@RequestBody Employee employee){
        employeeService.add(employee);
        return "success";
    }

    @PutMapping
    public String update(@RequestBody Employee employee){
        employeeService.update(employee);
        return "success";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id){
        employeeService.delete(id);
        return "success";
    }


}
