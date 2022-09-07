package headfirst_java.phraseomatic;

public class PhraseOMatic {

    public static void main(String[] args) {

        String[] wordListOne = {"Круглосуточный", "Трех-звенный", "30000-футовый", "Взаимный", "Обоюдный выигрыш",
                "Фронтэнд", "На основе вэб-технологий", "Проникающий",
                "Умный", "Шесть сигм", "Метод критического пути", "Динамичный"};

        String[] wordListTwo = {"уполномочиный", "трудный", "чистый продукт", "ориентированый", "центарльный",
                "распределенный", "кластеризованный", "фирменный", "нестондартый ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "поход",
        "уровень завоевоного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
