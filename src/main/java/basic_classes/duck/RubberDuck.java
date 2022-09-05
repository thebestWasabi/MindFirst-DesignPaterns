package basic_classes.duck;

import basic_classes.flyable.FlyNoWay;
import basic_classes.quackable.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Rubber duck");
    }

}
