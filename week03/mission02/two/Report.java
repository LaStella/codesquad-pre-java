package week03.mission02.two;

import java.util.ArrayList;

public class Report {
    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = "이름    |  학번  |중점과목|  점수    \n";
    public static final String LINE = "---------------------------------------------\n";


    private StringBuilder sb = new StringBuilder();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();

        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }

        return sb.toString();
    }

    private void makeFooter() {
        sb.append("\n");
    }

    private void makeHeader(Subject subject) {
        sb.append(LINE);
        sb.append("\t\t" + subject.getSubjectName());
        sb.append(TITLE);
        sb.append(HEADER);
        sb.append(LINE);
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
            sb.append(LINE);
        }
    }

    public void getSubjectGrade(Student student, String subjectName) {

        ArrayList<Score> scoreList = student.getScoreList();
        String majorSubjectName = student.getMajorSubject().getSubjectName();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};

        for (Score score : scoreList) {
            String ScoreSubjectName = score.getSubject().getSubjectName();
            // 학생이 가진 점수 중 찾는 과목의 점수를 탐색
            if(ScoreSubjectName.equals(subjectName)) {
                String grade;
                // 전공 학점 정책을 따르는 경우
                if (ScoreSubjectName.equals(majorSubjectName)) {
                    grade = gradeEvaluation[1].getGrade(score.getPoint());
                }
                // Pass/Fail 학점 정책을 따르는 경우
                else if (ScoreSubjectName.equals("방송댄스")) {
                    grade = gradeEvaluation[2].getGrade(score.getPoint());
                }
                // 위 두가지 경우를 제외한 나머지는 기본학점 정책에 따릅니다.
                else {
                    grade = gradeEvaluation[0].getGrade(score.getPoint());
                }
                sb.append(score.getPoint());
                sb.append(":");
                sb.append(grade);
            }
        }
    }


}
