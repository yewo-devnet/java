public class Main {
    public static void main(String[] args) {

        KYC customer = new KYC();

        customer.setCustomerName("Thando Mnyamula");
        System.out.println("CUSTOMER NAME IS : " + customer.getCustomerName());



        customer.depositFunds(1000);
        System.out.println(customer.depositFunds(1000));


        System.out.println(customer.withdrawFunds("450"));

    }
}