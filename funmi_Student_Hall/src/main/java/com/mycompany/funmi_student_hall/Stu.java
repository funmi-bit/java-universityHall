/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funmi_student_hall;



// javadoc option on google generate on html page
// git logs

import java.io.Serializable;

/**
 *
 * @author Funmi
 */
public class Stu extends person implements Serializable{
    private static final long serialVersionUID = 5462223600l;
    String courseTitle;
    String tuitionFee;
    String startDate;
    String endDate;
    int stuID;
    String rent;

    /**
     *
     * @param courseTitle
     * @param tuitionFee
     * @param startDate
     * @param endDate
     * @param rent
     * @param name
     * @param dob
     * @param homeAddress
     * @param countryOfOrigin
     * @param gender
     * @param stuGender
     */
    public Stu(String courseTitle, String tuitionFee, String startDate, String endDate, String rent, String name, String dob, String homeAddress, String countryOfOrigin, String gender, String stuGender) {
        this(courseTitle, tuitionFee, startDate, endDate, rent, name, dob, homeAddress, countryOfOrigin, gender);
    }

    /**
     *
     * @param courseTitle
     * @param tuitionFee
     * @param startDate
     * @param endDate
     * @param rent
     * @param name
     * @param dob
     * @param homeAddress
     * @param countryOfOrigin
     * @param gender
     */
    public Stu(String courseTitle, String tuitionFee, String startDate, String endDate, String rent, String name, String dob, String homeAddress, String countryOfOrigin, String gender) {
        super(name, dob, homeAddress, gender);
        this.courseTitle = courseTitle;
        this.tuitionFee = tuitionFee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.stuID = stuID;
        this.rent = rent;
    }

    /**
     *
     * @return
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     *
     * @param courseTitle
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     *
     * @return
     */
    public String getTuitionFee() {
        return tuitionFee;
    }

    /**
     *
     * @param tuitionFee
     */
    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    /**
     *
     * @return
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * @return
     */
    public int getStuID() {
        return stuID;
    }

    /**
     *
     * @param stuID
     */
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    /**
     *
     * @return
     */
    public String getRent() {
        return rent;
    }

    /**
     *
     * @param rent
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    String toFileString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}