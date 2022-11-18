package week03.one;

public class Platinum extends Member {
    public Platinum(String name, int money, int parkTime) {
        super(name, money, parkTime);
        memberGrade = "PLATINUM";
        discountRatio = 5;
        bonusRatio = 5;
    }

    @Override
    public int calcParkMoney() { return parkTime * 1000; }
}
