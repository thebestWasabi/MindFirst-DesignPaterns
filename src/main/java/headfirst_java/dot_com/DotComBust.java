package headfirst_java.dot_com;

import java.util.ArrayList;

public class DotComBust {

    // Объявляем и инициализируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfTurn = 0;


    public void setUpGame() {
        // Создаем три объекта DotCom, даем им имена и помещаем в ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить 3 сайта");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Постарайтесь потопить их за минимальное кол-во ходов");

        // Повторяем с каждым объектом DotCom в списке
        for (DotCom dotComToSet : dotComList) {
            // Запрашиваем у вспомогательного объекта адрес ссайта
            ArrayList<String> newLocation = helper.placeDotCom(3);
            //Вызываем сеттер из объекта DotCom, что бы передать ему местоположение,
            // которое только что получили от вспомогательного объекта
            dotComToSet.setLocationCells(newLocation);
        }
    }


    private void startPlaying() {
        // До тех пор пока список объектов DotCom не станет пустым
        while (!dotComList.isEmpty()) {
            // Получаем пользовательский ввод
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    private void checkUserGuess(String userGuess) {
        // Инкрементируем кол-во попыток, которые сделал пользователь
        numOfTurn++;
        // Подразумеваем промох, пока не выяснили обратного
        String result = "Мимо";

        // Повторяем это для вссех объектов DotCom в списке
        for (DotCom dotComToTest : dotComList) {
            // Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }


    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят");

        if (numOfTurn <= 18) {
            System.out.printf("Это заняло у вас %d ходов\n", numOfTurn);
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.printf("Это заняло у вас слишком много времени - %d ходов", numOfTurn);
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
