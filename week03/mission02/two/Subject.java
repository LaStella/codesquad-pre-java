package week03.mission02.two;

import java.util.*;

public class Subject {
    private String subjectName;

    private ArrayList<Student> studentList;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        studentList = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
