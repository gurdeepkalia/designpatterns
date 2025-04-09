package structural.decorator;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "This is basic coffee";
    }

    @Override
    public int cost() {
        return 10;
    }
}
