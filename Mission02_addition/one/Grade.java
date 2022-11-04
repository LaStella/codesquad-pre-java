package week01.mission02_addition.one;

public class Grade {
    Integer mathScore, scienceScore, englishScore;

    public Grade(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public Integer scoreAverage() {
        return (mathScore + scienceScore + englishScore)/3;
    }
}
