package week03.mission02.two;

public class Score {
    private Subject subject;
    private int point;

    public Score(Subject subject, int point) {
        this.subject = subject;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public Subject getSubject() {
        return subject;
    }
}
