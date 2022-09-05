package basic_classes.quackable;

public class ImitationQuacking implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("This duck makes a sound that mimics a quack");
    }
}
