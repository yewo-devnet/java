public class KYC {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance= balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int depositFunds(int funds) {
         int newfunds = funds + getBalance();

    }
    public String withdrawFunds(String withdraws) {
        int withdrawFunds  = Integer.parseInt(withdraws);
        if(getBalance() >= withdrawFunds || depositFunds()) {
           int newBalance = getBalance() - withdrawFunds;
           String str = Integer.toString(newBalance);
           return (str + "  " + "is your new balance");
        }
        else {
            return ("insufficient funds");
        }

    }
}
