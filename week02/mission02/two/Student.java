package week02.mission02.two;

import java.util.ArrayList;

public class Student {
    private static int id = 1000;
    private final int student_id;
    private String name;
    private String major;
    private ArrayList<Integer> points;

    public Student(String name, String major, ArrayList<Integer> points) {
        id++;
        student_id = id;
        this.name = name;
        this.major = major;
        this.points = points;
    }


    public int getTotalPoint() {
        return points.stream().mapToInt(i -> i).sum();
    }

    public int getAveragePoint() {
        return getTotalPoint()/points.size();
    }

    public void showInfo() {
        System.out.println(this.name + " 학생은 " + this.points.size() + "과목을 수강했습니다.");
        System.out.println("총점은 " + this.getTotalPoint() + "점이고 평균은 " + this.getAveragePoint()+ "점입니다.");
    }
}
