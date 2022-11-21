package week03.mission02.two;

import java.util.*;

public class Main {
    static final int KOREAN = 0;
    static final int MATH = 1;
    static final int DANCE = 2;
    public static void main(String[] args) {
        School school = School.getInstance();

        Subject[] subjects = {new Subject("국어"), new Subject("수학"), new Subject("방송댄스")};
        for (Subject s : subjects) {
            school.addSubject(s);
        }

        Student[] students = new Student[5];

        students[0] = new Student("강감찬", 211213, "국어국문학과", subjects[KOREAN]);
        students[0].addSubjectScore(new Score(subjects[KOREAN], 95));
        students[0].addSubjectScore(new Score(subjects[MATH], 56));
        students[0].addSubjectScore(new Score(subjects[DANCE], 95));

        students[1] = new Student("강유신", 212330, "컴퓨터공학과", subjects[MATH]);
        students[1].addSubjectScore(new Score(subjects[KOREAN], 95));
        students[1].addSubjectScore(new Score(subjects[MATH], 98));
        students[1].addSubjectScore(new Score(subjects[DANCE], 85));

        students[2] = new Student("신사임당", 201518, "국어국문학과", subjects[KOREAN]);
        students[2].addSubjectScore(new Score(subjects[KOREAN], 100));
        students[2].addSubjectScore(new Score(subjects[MATH], 88));
        students[2].addSubjectScore(new Score(subjects[DANCE], 55));

        students[3] = new Student("이순신", 202360, "국어국문학과", subjects[KOREAN]);
        students[3].addSubjectScore(new Score(subjects[KOREAN], 89));
        students[3].addSubjectScore(new Score(subjects[MATH], 95));

        students[4] = new Student("홍길동", 201290, "컴퓨터공학과", subjects[MATH]);
        students[4].addSubjectScore(new Score(subjects[KOREAN], 83));
        students[4].addSubjectScore(new Score(subjects[MATH], 56));

        for (Student s : students) {
            school.addStudent(s);
        }

        Report report = new Report();
        System.out.println(report.getReport());
    }
}
