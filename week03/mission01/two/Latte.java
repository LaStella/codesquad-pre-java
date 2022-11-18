package week03.two;

public class Latte extends Coffee {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        System.out.print(" Adding Milk");
    }
}
