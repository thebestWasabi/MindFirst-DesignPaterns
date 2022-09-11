package headfirst_java.simpedot_com;

public class SimpleDotComGame {

    public static void main(String[] args) {
        SimpleGameHelper help = new SimpleGameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int numOfTurn = 0;
        boolean isAlive = true;
        int randomNumber = (int) (Math.random() * 5);

        int[] location = {randomNumber, randomNumber + 1, randomNumber + 2};
        theDotCom.setLocationCells(location);

        while (isAlive == true) {
            String guess = help.getUsersInput("Введите число");
            String result = theDotCom.checkYourSelf(guess);
            numOfTurn++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.printf("Вам потребовалось %d попыток(и)", numOfTurn);
            }
        }
    }
}
