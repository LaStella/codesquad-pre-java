package week03.one;

public class Diamond extends Member {
    public Diamond(String name, int money, int parkTime) {
        super(name, money, parkTime);
        memberGrade = "DIAMOND";
        discountRatio = 10;
        bonusRatio = 10;
    }

    @Override
    public int calcParkMoney() {
        return 0;
    }
}
