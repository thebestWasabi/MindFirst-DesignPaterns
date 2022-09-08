package headfirst_java.dogs;

public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void bark() {
        if (size > 60) {
            System.out.println("Гав Гав!");
        } else if (size > 14) {
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф!");
        }
    }
}

class GoodDogTestDrive {

    GoodDog[] pets;

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.printf("Первоя собака: %sкг \n", one.getSize());
        System.out.printf("Вторая собака: %sкг \n", two.getSize());

        one.bark();
        two.bark();

    }

    public void pet() {
        pets = new GoodDog[7];
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
    }
}

class PoorDog {

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

class TestPoorDog {

    public static void main(String[] args) {
        PoorDog dog = new PoorDog();
        System.out.println("Размер собаки - " + dog.getSize());
        System.out.println("Имя собаки - " + dog.getName());
    }
}
