package coffee;

// Виды кофе
public class Espresso implements Coffee {
    @Override
    public double cost() { return 3.00; }
    @Override
    public String desc() { return "Эспрессо"; }
}
