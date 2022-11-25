package week04.mission01.one;

enum GRADE {
    RED(0, 1, 3000),
    PLATINUM(5, 5, 1000),
    DIAMOND(10, 10, 0);

    private final int discountRatio;
    private final int bonusRatio;
    private final int parkFee;

    GRADE(int discountRatio, int bonusRatio, int parkFee) {
        this.discountRatio = discountRatio;
        this.bonusRatio = bonusRatio;
        this.parkFee = parkFee;
    }
}
