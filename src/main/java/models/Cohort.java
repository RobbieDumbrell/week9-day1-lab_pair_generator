package models;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;

    public Cohort(String cohort) {
        this.name = cohort;
        this.students = new ArrayList<Student>();
        this.populateStudents();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void populateStudents(){
        Student student1 = new Student("Robbie");
        Student student2 = new Student("Emil");
        Student student3 = new Student("Gaz");
        Student student4 = new Student("Gemma");
        Student student5 = new Student("Kirstin");
        Student student6 = new Student("Marcin");
        Student student7 = new Student("Mark");
        Student student8 = new Student("Molly");
        Student student9 = new Student("Pat");
        Student student10 = new Student("Raphael");
        Student student11 = new Student("Tahnee");
        Student student12 = new Student("Bea");
        Student student13 = new Student("Digory");
        Student student14 = new Student("Euan");
        Student student15 = new Student("Joanna");
        Student student16 = new Student("Mike");
        Student student17 = new Student("Ricardo");
        Student student18 = new Student("Stoo");
        Student student19 = new Student("Vicky");
        Student student20 = new Student("Donald Trump");

        this.students.add(student1);
        this.students.add(student2);
        this.students.add(student3);
        this.students.add(student4);
        this.students.add(student5);
        this.students.add(student6);
        this.students.add(student7);
        this.students.add(student8);
        this.students.add(student9);
        this.students.add(student10);
        this.students.add(student11);
        this.students.add(student12);
        this.students.add(student13);
        this.students.add(student14);
        this.students.add(student15);
        this.students.add(student16);
        this.students.add(student17);
        this.students.add(student18);
        this.students.add(student19);
        this.students.add(student20);
    }



}
