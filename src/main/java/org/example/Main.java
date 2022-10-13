package org.example;

import org.example.*;   //bring in classes from part A via Jitpack

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Sean", 21);
        Student stud2 = new Student("Mike", 20);
        Student stud3 = new Student("Jack", 22);
        Student stud4 = new Student("Emma", 24);
        Student stud5 = new Student("Steve", 19);

        stud1.setCourse("Electronic & Computer Engineering");
        stud1.setDOB("18/02/2001");

        stud2.setCourse("Computer Science");
        stud2.setDOB("24/04/2002");

        stud3.setCourse("Electronic & Electrical Engineering");
        stud3.setDOB("06/08/2000");

        stud4.setCourse("Data Science");
        stud4.setDOB("12/10/1998");

        stud5.setCourse("Computer Science");
        stud5.setDOB("30/06/2003");

        System.out.println(stud1.getUsername());

        Lecturer lec1 = new Lecturer("John", 40);                                            //Creating lecturer objects
        Lecturer lec2 = new Lecturer("Ferghal", 55);
        Lecturer lec3 = new Lecturer("Liam", 43);
        Lecturer lec4 = new Lecturer("Peter", 60);
        Lecturer lec5 = new Lecturer("Brian", 38);


        lec1.setDOB("12/12/1982");
        lec2.setDOB("21/10/1967");
        lec3.setDOB("14/11/1979");
        lec4.setDOB("07/04/1962");
        lec5.setDOB("01/03/1984");


        Module soft = new Module("Programming 3", "CT417", lec1);                           //Creating module objects
        Module soc1 = new Module("System on Chip Design I", "EE451", lec2);
        Module soc2 = new Module("System on Chip Design II","EE452", lec2);
        Module mob = new Module("Mobile Networks Architecture and Service", "EE4101", lec3);
        Module esap = new Module("Embedded Systems Applications Programming", "EE347", lec4);
        Module dsp = new Module("Digital Signal Processing", "EE445", lec5);

        lec1.setModuleTeaching(soft);
        lec2.setModuleTeaching(soc1);
        lec2.setModuleTeaching(soc2);
        lec3.setModuleTeaching(mob);
        lec4.setModuleTeaching(esap);
        lec5.setModuleTeaching(dsp);




        soft.addStudent(stud1);
        soft.addStudent(stud2);
        soft.addStudent(stud3);
        soft.addStudent(stud4);
        soft.addStudent(stud5);

        System.out.println("Adding student that is already enrolled to module to see 'Student already enrolled' message");
        soft.addStudent(stud1);    //should return that student is already enrolled

        soc2.addStudent(stud1);
        soc2.addStudent(stud3);
        soc2.addStudent(stud5);

        soft.listStudentsEnrolled();
        soc2.listStudentsEnrolled();


    }


}