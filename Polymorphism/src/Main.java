
class car {
    private boolean engine;
    private int numberOfcylinders;
    private String nameOfCylinder;
    private int wheels;
    private int speed;

    public car(boolean engine, int numberOfcylinders, int wheels, String nameOfCylinder, int speed) {
        this.numberOfcylinders = numberOfcylinders;
        this.engine = true;
        this.wheels = 4;
        this.nameOfCylinder = nameOfCylinder;
        this.speed = speed;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return numberOfcylinders;
    }

    public int getWheels() {
        return wheels;
    }
    public String getNameOfCylinder() {
        return nameOfCylinder;
    }
    public int getSpeed() {
        return speed;
    }
    public String startEngine() {
        ;
        if (engine) {
            return "the car has started";
        } else {


            return "the car has started" ;

        }

    }
    public String accerelate() {

        return  " the car is accerelating" ;

    }
    public String brake(int reducedSpeed) {
        this.speed -= reducedSpeed;
        return  "reduced speed is " + this.speed;

    }

}
 class mercedes extends car {
    public mercedes(boolean engine, int numberOfcylinders, int wheels, String nameOfCylinder, int speed) {
        super(engine, numberOfcylinders, wheels, nameOfCylinder, speed);
    }

    @Override
    public String accerelate() {
        return " mercedes is accerelating";
    }
}
class audi extends car {
    public audi(boolean engine, int numberOfcylinders, int wheels, String nameOfCylinder, int speed) {
        super(engine, numberOfcylinders, wheels, nameOfCylinder, speed);
    }

    @Override
    public String accerelate() {
        return " audi is accerelating";
    }
}
class porsche extends car {
    public porsche(boolean engine, int numberOfcylinders, int wheels, String nameOfCylinder, int speed) {
        super(engine, numberOfcylinders, wheels, nameOfCylinder, speed);
    }

    @Override
    public String accerelate() {
        return " porsche is accerelating";
    }
}


public class Main {
    public static void main(String[] args) {
        //for (int i = 1; i < 5; i++) {
        System.out.println("ma error mbwee");
        car vehicle = new car(true, 4, 4," cm", 50);
        System.out.println(vehicle.accerelate());
        
        
    }
}