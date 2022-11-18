package week03.mission02.two;

import java.util.*;

public class Student {

    private String name;
    private int id;
    private String major;

    private Subject majorSubject;
    private ArrayList<Score> scoreList;

    public Student(String name, int id, String major, Subject majorSubject) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.majorSubject = majorSubject;
        scoreList = new ArrayList<>();
    }

    public void addSubjectScore(Score score) {
        score.getSubject().addStudent(this);
        scoreList.add(score);
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }
}
