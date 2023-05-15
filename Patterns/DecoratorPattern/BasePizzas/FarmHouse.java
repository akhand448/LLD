package DecoratorPattern.BasePizzas;

import DecoratorPattern.BasePizzas.BasePizza;

public class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 200;
    }
}