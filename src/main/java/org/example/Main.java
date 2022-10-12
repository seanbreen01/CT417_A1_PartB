package org.example;

import org.example.*;   //bring in classes from part A

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Sean", 21);
        Student stud2 = new Student("Mike", 20);
        Student stud3 = new Student("Jack", 22);
        Student stud4 = new Student("Emma", 24);
        Student stud5 = new Student("Steve", 19);


        System.out.println(stud1.getUsername());

        Lecturer lec1 = new Lecturer("John", 40);
        Lecturer lec2 = new Lecturer("Ferghal", 55);

        Module prog3 = new Module("Programming 3", "CT417", lec1);
        Module soc2 = new Module("System on Chip Design II","EE452", lec2);

        prog3.addStudent(stud1);
        prog3.addStudent(stud2);
        prog3.addStudent(stud3);
        prog3.addStudent(stud4);
        prog3.addStudent(stud5);

        System.out.println("Adding student that is already enrolled to module to see 'Student already enrolled' message");
        prog3.addStudent(stud1);    //should return that student is already enrolled

        soc2.addStudent(stud1);
        soc2.addStudent(stud3);
        soc2.addStudent(stud5);

        prog3.listStudentsEnrolled();
        soc2.listStudentsEnrolled();


    }


}