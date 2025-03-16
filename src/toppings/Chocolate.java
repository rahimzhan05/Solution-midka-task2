package toppings;

import coffee.Coffee;
// Добавка "Шоколад"
public class Chocolate extends Topping {
    public Chocolate(Coffee base) { super(base); }
    @Override
    public double cost() { return base.cost() + 0.80; }
    @Override
    public String desc() { return base.desc() + ", шоколад"; }
}