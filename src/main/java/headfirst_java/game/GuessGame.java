package headfirst_java.game;

public class GuessGame {

    Player player1;
    Player player2;
    Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();


        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 1 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Первый игрок думает, что это " + guessPlayer1);

            guessPlayer2 = player2.number;
            System.out.println("Второй игрок думает, что это " + guessPlayer2);

            guessPlayer3 = player3.number;
            System.out.println("Третий игрок думает, что это " + guessPlayer3);

            if (guessPlayer1 == targetNumber) {
                player1IsRight = true;
            }
            if (guessPlayer2 == targetNumber) {
                player2IsRight = true;
            }
            if (guessPlayer3 == targetNumber) {
                player3IsRight = true;
            }

            if (player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("У нас есть победитель");
                System.out.println("Первый игрок угадал? " + player1IsRight);
                System.out.println("Второй игрок угадал? " + player2IsRight);
                System.out.println("Третий игрок угадал? " + player3IsRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            }

        }
    }

}
