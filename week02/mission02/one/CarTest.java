package week02.mission02.one;

public class CarTest {
    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();

        System.out.println("첫번째 차 번호는" +myCar.showCarNumber());
        System.out.println("두번째 차 번호는" +yourCar.showCarNumber());
    }
}
