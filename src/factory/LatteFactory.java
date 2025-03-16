package factory;

import coffee.Coffee;
import coffee.Latte;

public class LatteFactory implements Factory {
    @Override
    public Coffee make() { return new Latte(); } // Создание латте
}
