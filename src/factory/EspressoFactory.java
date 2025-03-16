package factory;

import coffee.Coffee;
import coffee.Espresso;

public class EspressoFactory implements Factory {
    @Override
    public Coffee make() { return new Espresso(); } // Создание эспрессо
}
