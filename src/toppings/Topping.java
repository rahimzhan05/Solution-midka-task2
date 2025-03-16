package toppings;

import coffee.Coffee;

// Декоратор (Добавки)
abstract class Topping implements Coffee {
    protected Coffee base;
    public Topping(Coffee base) { this.base = base; }
}
