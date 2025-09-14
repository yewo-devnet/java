import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Truck mercedes = new Truck(2, 1, 4, "GwGON", "looking sexy", 4,1,1);
        mercedes.getEngine();
        Scanner input = new Scanner(System.in);
        System.out.print(" enter "  +
                "1 for name" +
                        "2 for engines" +
                " 3 for purpose " );
        String name = input.nextLine();
        if ( name.equals("1")) {
            name = mercedes.getName();
            System.out.println(name);
        }

        System.out.println("press any key then enter  to continue");
        String anyKey = input.nextLine();

        System.out.print(" enter "  +
                "1 for name" +
                "2 for engines" +
                " 3 for purpose " );
        String purpose = input.nextLine();
        if( purpose.equals("3")) {
            System.out.println(mercedes.getPurpose());
        }







    }

}
