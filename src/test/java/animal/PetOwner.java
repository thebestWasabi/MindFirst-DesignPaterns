package animal;

public class PetOwner {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Vet vet = new Vet();
        Animal dog = new Dog();
        Animal cat = new Cat();

        vet.giveShot(dog);
        vet.giveShot(cat);
    }
}
