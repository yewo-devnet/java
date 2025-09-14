import java.util.Scanner;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private String model;

    public Printer(int tonerLevel, int pagesPrinted, String model) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.model = model;

    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public String getModel() {
        return model;
    }
    public void fillUpToner(int fillingUpToner) {
        //java.util.Scanner input = new Scanner(System.in);
        //int fillingUpToner = input.nextInt();
        if (tonerLevel < 100) {
            tonerLevel +=  fillingUpToner;
            System.out.println("New toner level is  " + tonerLevel);
        } else {
            System.out.println("Toner is at 100% capacity");
        }
    }

    public String printingPages(int pagesToBePrinted) {
        pagesPrinted += pagesToBePrinted;
        return "pages printed = " +   pagesPrinted;


    }
}
