import java.util.Scanner;

public class Book extends Publications {

    private int yearOfPublication;
    private String edition;


    public Book(String title, String author, int numberOfPages, int yearOfPublication, String edition) {
        super(title, author, numberOfPages);
        this.yearOfPublication = yearOfPublication;
        this.edition = edition;
    }


    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getEdition() {
        return edition;
    }
    java.util.Scanner input = new Scanner(System.in);

    @Override
    public void addOrBorrow() {
        super.addOrBorrow();
        System.out.println("year");
        int yearOfPublication = input.nextInt();;
        System.out.println("enter edition");
        String edition = input.nextLine();
    }
}

