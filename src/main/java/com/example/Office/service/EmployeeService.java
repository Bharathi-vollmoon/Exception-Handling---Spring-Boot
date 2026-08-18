package com.example.Office.service;

import com.example.Office.exception.EmployeeAlreadyExistsException;
import com.example.Office.exception.EmployeeNotFoundException;
import com.example.Office.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployee(Employee employee) {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(int emp_Id) {
        return employeeRepo.findById(emp_Id).orElseThrow(() -> new EmployeeNotFoundException("employee not found with id "+emp_Id));

    }
    public String setEmployee(Employee employee) {
        if (employeeRepo.existsById(employee.getEmp_id())) {
            throw new EmployeeAlreadyExistsException("Employee already exists with id : "+employee.getEmp_id());
        }else {
            employeeRepo.save(employee);
            return "the employee added successfully";
        }

    }
    public String deleteEmployess(Employee employee) {
        employeeRepo.deleteAll();
        return "the employess are deleted";
    }

    public String deleteEmployeeById(int empId) {
        employeeRepo.deleteById(empId);
        return "the selected employee deleted";
    }


}
