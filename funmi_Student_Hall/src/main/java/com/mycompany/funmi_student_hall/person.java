/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funmi_student_hall;

/**
 *
 * @author HP
 */
abstract class person {
    String name;
    String dob;
    String homeAddress;
    String gender;


    public person(String name, String dob, String homeAddress, String gender) {

        this.name = name;
        this.dob = dob;
        this.homeAddress = homeAddress;
        this.gender= gender;
    }
    
    public String getName() {
        return name;
    }

    public void setTuitionFee(String name) {
        this.name = name;
    }
    
    public String getStartDate() {
        return dob;
    }

    public void setStartDate(String dob) {
        this.dob = dob;
    }

    public String geHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    public String getGender() {
        return gender;
    }

    public void setEndDate(String gender) {
        this.gender = gender;
    }
}

