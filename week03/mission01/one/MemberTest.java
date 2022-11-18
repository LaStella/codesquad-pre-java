package week03.one;

public class MemberTest {
    public static void main(String[] args) {
        Member[] memebers = new Member[5];
        memebers[0] = new Red("James", 10000, 2);
        memebers[1] = new Red("Tomas", 30000, 2);
        memebers[2] = new Platinum("Edward", 10000, 2);
        memebers[3] = new Platinum("Percy", 30000, 2);
        memebers[4] = new Diamond("Elizabet", 30000, 2);

        for (Member m : memebers) {
            m.showInfo();
        }
    }
}
