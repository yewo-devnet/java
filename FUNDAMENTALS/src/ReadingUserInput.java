import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

       boolean digit = hasNextInt();
        System.out.println(digit);

    }
    public static boolean hasNextInt(){
        java.util.Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number < 0 ) {
            return false;
        }

            return true;

    }
    public static void nextInt(){
        java.util.Scanner in = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        System.out.println("ENTER A NUMBER");
        while(count < 10) {
             boolean number = hasNextInt();

//            sum += number;

            count++;
        }

    }
}
