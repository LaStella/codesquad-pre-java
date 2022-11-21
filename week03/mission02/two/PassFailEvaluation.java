package week03.mission02.two;

public class PassFailEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int point) {
        String grade = "F";

        if (point >= 70) grade = "P";

        return grade;
    }
}
