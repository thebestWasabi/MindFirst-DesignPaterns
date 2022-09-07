package headfirst_patterns.strategy;

import headfirst_patterns.strategy.duck.*;
import headfirst_patterns.strategy.flyable.FlyRocketPowered;
import headfirst_patterns.strategy.quackable.ImitationQuacking;

public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        decoy.setQuackBehavior(new ImitationQuacking());
        decoy.performQuack();
    }

}
