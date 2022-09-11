package headfirst_java;

public class SimpleDotComGame {

    public static void main(String[] args) {
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int numOfTurn = 0;
        boolean isAlive = true;
        int randomNumber = (int) (Math.random() * 5);

        int[] location = {randomNumber, randomNumber + 1, randomNumber + 2};
        theDotCom.setLocationCells(location);

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourSelf(guess);
            numOfTurn++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.printf("Вам потребовалось %d попыток(и)", numOfTurn);
            }
        }
    }
}
