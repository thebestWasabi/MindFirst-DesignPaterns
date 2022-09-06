package strategy.duck;

import strategy.flyable.FlyNoWay;
import strategy.quackable.Quack;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a Model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
