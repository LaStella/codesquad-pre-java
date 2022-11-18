package week03.mission02.two;

import java.util.ArrayList;

public class School {
    private static School instance = new School();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }
}
