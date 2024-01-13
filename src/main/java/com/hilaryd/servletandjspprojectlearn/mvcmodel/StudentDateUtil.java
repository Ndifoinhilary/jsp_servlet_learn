package com.hilaryd.servletandjspprojectlearn.mvcmodel;

import java.util.ArrayList;
import java.util.List;

public class StudentDateUtil {
    public static List<Student> getStudent(){
//        create a list to collect the students
        List<Student> students = new ArrayList<>();
//        add the students or create the student
        students.add(new Student("John", "Doe", "johndoe@gmail.com"));
        students.add(new Student("John", "Smith", "johnsmith@gmail.com"));
        students.add(new Student("Paul", "Doe", "pauldoe@gmail.com"));
        students.add(new Student("Boob", "Doe", "boobdoe@gmail.com"));
        students.add(new Student("Hilary", "Franck", "hilaryfranck@gmail.com"));
        students.add(new Student("Eve", "Jay", "evejay@gmail.com"));
        students.add(new Student("Denail", "Soh", "denailsoh@gmail.com"));
        students.add(new Student("Peter", "James", "peterjames@gmail.com"));

//        return the list of students
        return students;
    }
}
