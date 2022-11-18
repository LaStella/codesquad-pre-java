package week03.two;

public class WhippedCream extends Coffee {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        System.out.println("Adding WhippedCream");
    }
}
