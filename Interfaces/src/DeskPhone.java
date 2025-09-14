public class DeskPhone implements ITelephone {
    private int myNumber ;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("does not have a button to power on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isRinging) {
            System.out.println(phoneNumber + " is ringing");
        }

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}