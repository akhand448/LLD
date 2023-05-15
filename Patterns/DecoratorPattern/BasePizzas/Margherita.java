package DecoratorPattern.BasePizzas;

import DecoratorPattern.BasePizzas.BasePizza;

public class Margherita extends BasePizza {

    @Override
    public int cost(){
        return 100;
    }
}