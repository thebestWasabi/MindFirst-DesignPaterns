package headfirst_java;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] location = {2, 3, 4};
        dot.setLocationCells(location);

        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
        String testResult = "Неудача";

        if (result.equals("Попал")) {
            testResult = "Пройден";
        }

        System.out.println(testResult);
    }
}
