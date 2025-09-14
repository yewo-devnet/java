public class Car extends Vehicle{
    private int wheels;
    private int steering;

    public Car(int tires, int engine, int seats, String name, String purpose, int wheels, int steering) {
        super(tires, engine, seats, name, purpose);
        this.wheels = wheels;
        this.steering = steering;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteering() {
        return steering;
    }
}
