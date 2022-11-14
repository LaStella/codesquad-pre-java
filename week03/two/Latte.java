package week03.two;

public class Latte extends Coffee {
    public Latte(Coffee coffee) {
        super(coffee);
        this.state += " Adding Milk";
    }
}
