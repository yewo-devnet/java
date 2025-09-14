public class Methods {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("messi" , highScorePosition);

    }
    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + "  managed to get into position  " + playersPosition + "  on the high score table");

    }
    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore > 1000)
            return 1        ;
        else if (playersScore > 500 && playersScore < 1000)
            return 2;
        else if (playersScore > 100 && playersScore < 500)
            return 3;
        else
            return 4;
    }
}
