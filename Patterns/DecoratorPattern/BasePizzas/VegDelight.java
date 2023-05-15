package DecoratorPattern.BasePizzas;

import DecoratorPattern.BasePizzas.BasePizza;

public class VegDelight extends BasePizza {

    @Override
    public int cost(){
        return 120;
    }
}