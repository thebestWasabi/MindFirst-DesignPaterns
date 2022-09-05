package basic_classes.duck;

import basic_classes.flyable.FlyWithWings;
import basic_classes.quackable.Quack;

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
