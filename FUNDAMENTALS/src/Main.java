public class Main {
    public static void main(String[] args) {
        //int time = getDurationString(80, 120);
        getDurationString(80, 40);

    }
    public static void getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            double newMinutes = (double)seconds/60 + minutes;
            int hours = (int)(newMinutes/60) ;
            double second = (double)(newMinutes%60) * 60 + seconds;
            System.out.println(hours + ": " + minutes + " : " + second);



        }
        else {
            System.out.println( "invalid");
        }

    }
}