package headfirst_java.multiple_arguments;

public class TestStuff {
    public static void main(String[] args) {
        TestStuff stuff = new TestStuff();
        int x = 7;
        stuff.go();
    }

    void go() {
        TestStuff testStuff = new TestStuff();
        testStuff.takeTwo(12, 23);
    }

    private void takeTwo(int x, int y) {
        int sum = x + y;
        System.out.printf("Сумма равна %s", sum);
    }
}