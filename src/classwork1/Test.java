package classwork1;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine("V8");
        String engine = car.getEngine();
        car.setTransmission("Automatic");
        String transmission = car.getTransmission();
        System.out.println("Engine: " + engine + ", transmission: " + transmission);
    }
}

class Car {
    private String Transmission = "V5";
    private String engine = "Mechanic";
    private int countOfSeats = 4;

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
