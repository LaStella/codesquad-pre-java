package week02.mission02.one;

public class HyundaiFactory {
    private static HyundaiFactory instance = new HyundaiFactory();

    public static HyundaiFactory getFactory() {
        if (instance == null) {
            instance = new HyundaiFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}
