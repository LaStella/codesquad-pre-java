package week03.two;

public class Mocha extends Coffee {
    public Mocha(Coffee coffee) {
        super(coffee);
    }
    @Override
    public void brewing() {
        System.out.print(" Adding Mocha Syrup");
    }
}
