package com.example.Office.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int emp_id;
    private String emp_name;
    private String emp_designation;
    private String emp_pho_no;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }

    public String getEmp_pho_no() {
        return emp_pho_no;
    }

    public void setEmp_pho_no(String emp_pho_no) {
        this.emp_pho_no = emp_pho_no;
    }
}
