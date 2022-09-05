package basic_classes.duck;

import basic_classes.flyable.FlyNoWay;
import basic_classes.quackable.Quack;

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
