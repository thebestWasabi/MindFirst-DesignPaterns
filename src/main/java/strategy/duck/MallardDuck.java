package strategy.duck;

import strategy.flyable.FlyWithWings;
import strategy.quackable.Quack;

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
