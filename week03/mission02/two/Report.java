package week03.mission02.two;

import java.util.ArrayList;

public class Report {
    School school = School.getInstance();
    private StringBuilder sb = new StringBuilder();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();
        for (Subject subject : subjectList) {
            makeBody(subject);
        }
        return sb.toString();
    }

    private void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();

        for (Student student : studentList) {
            sb.append(student.getName());
            sb.append(" | ");
            sb.append(student.getId());
            sb.append(" | ");
            sb.append(student.getMajorSubject().getSubjectName());
            sb.append(" | ");
            getSubjectGrade(student, subject.getSubjectName());
            sb.append("\n");

        }
    }

    public void getSubjectGrade(Student student, String subjectName) {

        ArrayList<Score> scoreList = student.getScoreList();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};

        for (Score score : scoreList) {
            // 학생이 가진 점수 중 찾는 과목의 점수를 탐색
            if(score.getSubject().getSubjectName().equals(subjectName)) {
                sb.append(score.getPoint());
                sb.append(":");
                sb.append(gradeEvaluation[0].getGrade(score.getPoint()));
            }
        }
    }


}
