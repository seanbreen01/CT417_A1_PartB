package org.example;

import org.example.*;   //bring in classes from part A via Jitpack
import org.joda.time.DateTime;
public class Main {
    public static void main(String[] args) {

        System.out.println("Creating Student objects, setting their courses and dates of birth");

        Student stud1 = new Student("Sean", 21);
        Student stud2 = new Student("Mike", 20);
        Student stud3 = new Student("Jack", 22);
        Student stud4 = new Student("Emma", 24);
        Student stud5 = new Student("Nora", 19);

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


        System.out.println("Creating Lecturer objects, and setting their dates of birth");

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


        System.out.println("Creating Modules, giving them names, module IDs and the lecturer associated with the module");


        Module soft = new Module("Programming 3", "CT417", lec1);                           //Creating module objects
        Module soc1 = new Module("System on Chip Design I", "EE451", lec2);
        Module soc2 = new Module("System on Chip Design II","EE452", lec2);
        Module mob  = new Module("Mobile Networks Architecture and Service", "EE4101", lec3);
        Module esap = new Module("Embedded Systems Applications Programming", "EE347", lec4);
        Module dsp  = new Module("Digital Signal Processing", "EE445", lec5);



        lec1.setModuleTeaching(soft);
        lec2.setModuleTeaching(soc1);
        lec2.setModuleTeaching(soc2);
        lec3.setModuleTeaching(mob);
        lec4.setModuleTeaching(esap);
        lec5.setModuleTeaching(dsp);

        System.out.println("Adding students to different modules");

        soft.addStudent(stud1);
        soft.addStudent(stud2);
        soft.addStudent(stud3);
        soft.addStudent(stud4);
        soft.addStudent(stud5);


        soc1.addStudent(stud1);         //Adding students to System on chips modules
        soc1.addStudent(stud3);
        soc1.addStudent(stud5);

        soc2.addStudent(stud1);
        soc2.addStudent(stud3);
        soc2.addStudent(stud5);


        mob.addStudent(stud1);
        mob.addStudent(stud2);
        mob.addStudent(stud3);

        esap.addStudent(stud4);
        esap.addStudent(stud5);


        dsp.addStudent(stud1);
        dsp.addStudent(stud2);
        dsp.addStudent(stud3);
        dsp.addStudent(stud4);
        dsp.addStudent(stud5);

        System.out.println("Adding student that is already enrolled to module to see 'Student already enrolled' message");
        dsp.addStudent(stud1);    //should return that student is already enrolled


        System.out.println("\nCreating 2 courseProgrammes, one for electronic and computer engineering, and the other for computer science \nhence populating these with modules as needed");

        CourseProgramme ece = new CourseProgramme("Electronic and Computer Engineering", new DateTime(2019,9,5,9,0), new DateTime(2024, 5, 6, 17,0) );
        CourseProgramme compsci = new CourseProgramme("Computer Science", new DateTime(2019,9,5,9,0), new DateTime(2024, 5, 6, 17,0));


        ece.addModule(soft);        //Adding created modules, and students to ECE CourseProgramme
        ece.addModule(soc1);
        ece.addModule(soc2);
        ece.addModule(mob);
        ece.addModule(esap);
        ece.addModule(dsp);

        ece.addStudent(stud1);
        ece.addStudent(stud3);
        ece.addStudent(stud4);

        compsci.addModule(soft);
        compsci.addModule(mob);
        compsci.addModule(dsp);

        compsci.addStudent(stud2);
        compsci.addStudent(stud5);



        //Start Printing stuff from here on as requested by assignment brief
        System.out.println("Have now created and populated all the relevant objects and will now print them to the console");

        System.out.println(ece);    //print basic info about ece CourseProgramme, via overridden toString
        System.out.println("Modules associated with ECE Course Programme:");
        ece.printModules();
        System.out.println("Students enrolled in ECE Course Programme:");
        ece.printStudentsEnrolled();

        System.out.println(compsci);    //print basic info about ece CourseProgramme, via overridden toString
        System.out.println("Modules associated with Computer Science Course Programme:");
        compsci.printModules();
        System.out.println("Students enrolled in Computer Science Course Programme:");
        compsci.printStudentsEnrolled();



        soft.listStudentsEnrolled();
        soc1.listStudentsEnrolled();
        soc2.listStudentsEnrolled();
        mob.listStudentsEnrolled();
        esap.listStudentsEnrolled();
        dsp.listStudentsEnrolled();

        System.out.println("End of main");
    }


}