package headfirst_patterns.strategy.flyable;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
