package week03.two;

public class Coffee {
    protected String state;

    public Coffee() {

    }

    public Coffee(Coffee coffee) {
        this.state = coffee.state;
    }

    public void brewing() {
        System.out.print(state);
    }
}
