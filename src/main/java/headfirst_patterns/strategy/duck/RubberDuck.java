package headfirst_patterns.strategy.duck;

import headfirst_patterns.strategy.flyable.FlyNoWay;
import headfirst_patterns.strategy.quackable.Squeak;

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
