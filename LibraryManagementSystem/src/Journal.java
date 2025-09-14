public class Journal extends Publications {

    private int articleNumber;

    public Journal(String title, String author, int numberOfPages, int articleNumber) {
        super(title, author, numberOfPages);
        this.articleNumber = articleNumber;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    @Override
    public void addOrBorrow() {
        super.addOrBorrow();
        System.out.println("Enter article number");
    }
}
