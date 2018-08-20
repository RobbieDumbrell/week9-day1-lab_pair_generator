package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    private String name;
    private ArrayList<Student> students;

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

    public void populateStudents() {
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
        Student student20 = new Student("The Queen");

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

    public Student selectRandomStudent() {
        Collections.shuffle(this.students);
        return this.students.get(0);
    }

    public ArrayList<Student> selectRandomPair() {
        ArrayList<Student> randomPair = new ArrayList<Student>();

        Collections.shuffle(this.students);
        Student firstStudent = this.students.get(0);
        Student secondStudent = this.students.get(1);

        randomPair.add(firstStudent);
        randomPair.add(secondStudent);

        return randomPair;
    }

    public ArrayList<Student> selectRandomGroup(int groupSize) {
        ArrayList<Student> randomGroup = new ArrayList<Student>();

        if (groupSize > 20) {
            return null;
        }

        Collections.shuffle(this.students);

        for (int i = 0; i < groupSize; i++) {
            Student nextStudent = this.students.get(i);
            randomGroup.add(nextStudent);
        }

        return randomGroup;
    }

    public ArrayList<ArrayList<Student>> generateRandomPairs() {
        ArrayList<ArrayList<Student>> randomPairs = new ArrayList<>();

        Collections.shuffle(this.students);

        for (int i = 0; i < 20; i += 2) {
            ArrayList<Student> nextPair = new ArrayList<Student>();
            Student firstStudent = this.students.get(i);
            Student secondStudent = this.students.get(i + 1);
            nextPair.add(firstStudent);
            nextPair.add(secondStudent);
            randomPairs.add(nextPair);
        }
        return randomPairs;
    }

    public ArrayList<ArrayList<Student>> generateRandomGroups(int groupSize) {
        ArrayList<ArrayList<Student>> randomGroups = new ArrayList<>();

        Collections.shuffle(this.students);

        int leftovers = (20 % groupSize);
        int amountToLoop = 20 - leftovers;

        for (int i = 0; i < amountToLoop; i += groupSize) {
            ArrayList<Student> nextGroup = new ArrayList<>();
            for (int j = 0; j < groupSize; j++) {
                Student nextStudent = this.students.get(i + j);
                nextGroup.add(nextStudent);
            }
            randomGroups.add(nextGroup);
        }
        return randomGroups;
    }


}
