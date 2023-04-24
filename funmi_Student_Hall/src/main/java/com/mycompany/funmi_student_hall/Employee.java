/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funmi_student_hall;

/**
 *
 * @author HP
 */
import java.io.Serializable;
public class Employee implements Serializable{
    private static final long serialVersionUID = 5462223600l;
    String dateEmployed;
    String role;
    String salary;

    public Employee(String dateEmployed, String role, String salary) {
        this.dateEmployed = dateEmployed;
        this.role = role;
        this.salary = salary;
    }

    public String getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(String dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
