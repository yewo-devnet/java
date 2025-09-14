public class Magazine extends Publications {

    private String ads;

    public Magazine(String title, String author, int numberOfPages, String ads) {
        super(title, author, numberOfPages);
        this.ads = ads;
    }

//    public String getAds() {
//        return ads;
//    }

    @Override
    public void addOrBorrow() {
        super.addOrBorrow();
        System.out.println("Enter ads");
        String ads = input.nextLine();

    }
}
