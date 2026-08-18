package com.example.Office.cotroller;

import com.example.Office.model.Employee;
import com.example.Office.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(@RequestBody Employee employee) {
        return employeeService.getEmployee(employee);
    }

    @GetMapping("/employee/{emp_id}")
    public Employee getEmployeeById(@PathVariable ("emp_id") int emp_id){
        return employeeService.getEmployeeById(emp_id);
    }

    @PostMapping("/employee")
    public String setEmployee(@RequestBody Employee employee ){
        return employeeService.setEmployee(employee);
    }

    @DeleteMapping("/employee")
    public String deleteEmployees(@RequestBody Employee employee){
        return employeeService.deleteEmployess(employee);
    }
    @DeleteMapping("/employee/{emp_id}")
    public String deleteEmployeeById(@PathVariable ("emp_id") int emp_id){
        return employeeService.deleteEmployeeById(emp_id);
    }
}
