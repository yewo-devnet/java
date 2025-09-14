public class DayOfTheWeekChallenge {
    public static void main(String [] args) {
        printDayOfTheWeek(2);

    }
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Day is Sunday");
                break;
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Sartuday");
                break;
            default:
                System.out.println("invalid input");
                break;

        }
    }
}
