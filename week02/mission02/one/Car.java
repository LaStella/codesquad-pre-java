package week02.mission02.one;

public class Car {
    private static int serialNum = 1000;
    private final int carNum;

    public Car() {
        carNum = serialNum;
        serialNum++;
    }

    public int showCarNumber() {
        return carNum;
    }
}
