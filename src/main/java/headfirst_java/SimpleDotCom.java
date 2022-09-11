package headfirst_java;

public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits = 0;


    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }


    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
