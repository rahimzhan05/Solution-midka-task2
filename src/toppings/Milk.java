package toppings;

import coffee.Coffee;
// Добавка "Молоко"
public class Milk extends Topping {
    public Milk(Coffee base) { super(base); }
    @Override
    public double cost() { return base.cost() + 0.50; }
    @Override
    public String desc() { return base.desc() + ", молоко"; }
}
