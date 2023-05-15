package DecoratorPattern.ToppingDecorators;

import DecoratorPattern.ToppingDecorators.ToppingDecorator;


public abstract class ToppingDecorator extends BasePizza{
    BasePizza basePizza;

    public extraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 10;
    }

}