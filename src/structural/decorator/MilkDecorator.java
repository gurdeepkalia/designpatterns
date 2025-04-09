package structural.decorator;
/*
* used to add behavior to objects dynamically — without changing their class
* */
public class MilkDecorator implements Coffee {
    private final Coffee coffee;
    private static final int TAX = 2;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }

    @Override
    public int cost() {
        return coffee.cost() + TAX;
    }
}
