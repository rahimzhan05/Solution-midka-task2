package coffee;
// виды кофе
public class Latte implements Coffee {
    @Override
    public double cost() { return 4.50; }
    @Override
    public String desc() { return "Латте"; }
}