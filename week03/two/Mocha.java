package week03.two;

public class Mocha extends Coffee {
    public Mocha(Coffee coffee) {
        super(coffee);
        this.state += " Adding Mocha Syrup";
    }
}
