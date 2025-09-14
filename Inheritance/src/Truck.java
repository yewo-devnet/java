public class Truck extends Car{
    private int canopy;

    public Truck(int tires, int engine, int seats, String name, String purpose, int wheels, int steering, int canopy) {
        super(tires, engine, seats, name, purpose, wheels, steering);
        this.canopy = canopy;
    }
    public int getCanopy() {
        return canopy;
    }
}

