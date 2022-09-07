package headfirst_java.phraseomatic;

public class Dogs {

    public static void main(String[] args) {

        String[] pests = {"Фидо", "Зевс", "Бин"};

        int x = pests.length;

        String name = pests[2];
        String s = String.format("%s - собка", name);
        System.out.println(s);

    }
}
