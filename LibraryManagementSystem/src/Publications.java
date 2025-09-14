import java.util.Scanner;

public class Publications {
    private String title;
    private String author;
    private int numberOfPages;

    public Publications(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    java.util.Scanner input = new Scanner(System.in);
    public void addOrBorrow() {
        System.out.println("Enter book title ");
        String title = input.nextLine();
        System.out.println("Enter Author");
        String author = input.nextLine();
        System.out.println("Enter Number of pages ");
        int numberOfPages = input.nextInt();
    }
}
