package headfirst_patterns.strategy.duck;

import headfirst_patterns.strategy.flyable.FlyNoWay;
import headfirst_patterns.strategy.quackable.Quack;

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
