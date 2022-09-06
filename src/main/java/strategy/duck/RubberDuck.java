package strategy.duck;

import strategy.flyable.FlyNoWay;
import strategy.quackable.Squeak;

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
