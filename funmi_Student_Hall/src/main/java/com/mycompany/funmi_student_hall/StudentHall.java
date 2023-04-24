/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funmi_student_hall;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class StudentHall implements Serializable{
    private static final long serialVersionUID = 5462223600l;
    private ArrayList<Stu> studentResidents;
    public final int MAX;
    private Stu e;

    public StudentHall(int maxIn) {
        studentResidents = new ArrayList<>();
        MAX = maxIn;
        
    }

   
    public boolean addStudent(Stu theStu) {
        if (!isFull()) {
            studentResidents.add(e);
            return true;
        } else {
            return false;
        }
        //return addStudent(theStu);
    }
    
       public boolean emp(Employee theEmp) {
        if (!isFull()) {
            studentResidents.add(e);
            return true;
        } else {
            return false;
        }
        //return addStudent(theStu);
    }

    /**
     * Check whether or not the list is empty
     *
     *  Returns true if the list is empty and false if it's not empty
     * @return 
     */
    public boolean isEmpty() {
        return studentResidents.isEmpty();
    }

    /**
     * Check whether or not the list is full
     *
     * Returns true if the list is full and false if it's not full
     * @return 
     */
    public boolean isFull() {
        return studentResidents.size() == MAX;
    }


    public int getTotal() {
        return studentResidents.size();
    }


    public Stu getStu(int positionIn) {
        if (positionIn < 0 || positionIn >= getTotal()) // check for valid position
        {
            return null; // no object found at given position
        } else {
            // remove one from logical poition to get ArrayList position
            return studentResidents.get(positionIn);
        }
    }

    public String displayStudentsInfo() {
        String output = "\n";
        for (int counter = 0; counter < studentResidents.size(); counter++) {
            output += studentResidents.get(counter).tuitionFee + "\t" + studentResidents.get(counter).startDate;
            output += "\n" + studentResidents.get(counter).stuID + "\t" + studentResidents.get(counter).courseTitle + "\t" + studentResidents.get(counter).endDate;
            output += "\n\n";
        }
        return output;
    }
}
