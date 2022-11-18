package week03.mission02.two;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        School school = School.getInstance();

        Subject[] subjects = {new Subject("국어"), new Subject("수학"), new Subject("방송댄스")};
        for (Subject s : subjects) {
            school.addSubject(s);
        }

        Student s = new Student("강감찬", 211213, "국어국문학과", subjects[0]);
        s.addSubjectScore(new Score(subjects[0], 85));

        Student a = new Student("강찬", 21213, "국어국문학과", subjects[0]);
        a.addSubjectScore(new Score(subjects[0], 10));

        Report report = new Report();
        System.out.println(report.getReport());

        System.out.println();
    }
}
