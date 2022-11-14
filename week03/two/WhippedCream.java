package week03.two;

public class WhippedCream extends Coffee {
    public WhippedCream(Coffee coffee) {
        super(coffee);
        this.state += " Adding WhippedCream";
    }
}
