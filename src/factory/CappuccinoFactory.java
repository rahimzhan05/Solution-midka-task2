package factory;

import coffee.Cappuccino;
import coffee.Coffee;

public class CappuccinoFactory implements Factory {
    @Override
    public Coffee make() { return new Cappuccino(); } // Создание капучино
}
