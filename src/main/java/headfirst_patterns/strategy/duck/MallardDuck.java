package headfirst_patterns.strategy.duck;

import headfirst_patterns.strategy.flyable.FlyWithWings;
import headfirst_patterns.strategy.quackable.Quack;

public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
