package my_arraylist;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
            nextIndex++;
        }
    }
}

class MyAnimalListTestDrive {

    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        list.add(d);
        list.add(c);
    }
}
