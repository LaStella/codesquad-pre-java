package week03.one;

public class Member {
    protected String name;
    protected int money;
    protected int parkTime;
    protected String memberGrade;
    protected int bonusRatio;
    protected int discountRatio;
    protected int bonusPoint;

    public Member(String name, int money, int parkTime) {
        this.name = name;
        this.money = money;
        this.parkTime = parkTime;
    }

    public int calcPayMoney() {
        bonusPoint += money * bonusRatio / 100;
        return money - money * discountRatio / 100;
    }

    public int calcParkMoney() {
        return parkTime * 3000;
    }

    public void showInfo() {
        System.out.println(name + "님의 지불 금액은 " + calcPayMoney() + " 원이고, 적립포인트는 " + bonusPoint + "점 입니다.");
        System.out.println("주차 요금은 " + calcParkMoney() + "원 입니다.");
    }
}
