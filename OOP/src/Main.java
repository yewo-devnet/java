public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car();
        Car audi = new Car();
        mercedes.setModel("GWagon");
        System.out.println("Model is " + mercedes.getModel() );

        int balance = 40;
        int funds = 50;
        balance = balance + funds ;
        System.out.println(balance);

    }
}