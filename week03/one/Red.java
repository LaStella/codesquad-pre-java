package week03.one;

public class Red extends Member{
    public Red(String name, int money, int parkTime) {
        super(name, money, parkTime);
        memberGrade = "RED";
        discountRatio = 0;
        bonusRatio = 1;
    }
}
