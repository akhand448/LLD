package DecoratorPattern.ToppingDecoratos;

import DecoratorPattern.ToppingDecorators.ToppingDecorator;

public class Mashroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mashroom(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost(){

        return this.basePizza.cost() + 15;
    }
}