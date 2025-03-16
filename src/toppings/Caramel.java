package toppings;

import coffee.Coffee;
// Добавка "Карамель"
public class Caramel extends Topping {
    public Caramel(Coffee base) { super(base); }
    @Override
    public double cost() { return base.cost() + 0.70; }
    @Override
    public String desc() { return base.desc() + ", карамель"; }
}
