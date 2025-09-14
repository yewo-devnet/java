import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
//        System.out.println(calculateArea(50));
       // java.util.Scanner input = new Scanner(System.in);
        //calculateArea();
      // System.out.println(calculateArea());

      //  System.out.println();
        Printer dellPrinter = new Printer(5, 138, "DELL MAK 2");
        System.out.println(dellPrinter.getPagesPrinted());
        System.out.println(dellPrinter.printingPages(567));
        dellPrinter.fillUpToner(100);



    }
    public static void calculateArea() {
        java.util.Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double area = Math.PI * radius * radius ;


    }
}