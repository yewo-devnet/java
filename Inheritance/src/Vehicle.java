public class Vehicle {
    private int tires;
    private int engine;
    private int seats;
    private String name;
    private String purpose;

    public Vehicle(int tires, int engine, int seats, String name, String purpose) {
        this.tires = tires;
        this.engine = engine;
        this.seats = seats;
        this.name = name;
        this.purpose = purpose;
    }

    public void increasingSpeed(int speed) {
        System.out.println(speed);

    }

    public int getTires() {
        return tires;
    }

    public int getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }
}
