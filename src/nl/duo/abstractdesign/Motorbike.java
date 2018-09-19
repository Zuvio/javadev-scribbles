package nl.duo.abstractdesign;

public class Motorbike extends Vehicle {

    public int drive(int distance) {
        super.setMileage(distance);
        return super.getMileage();
    }

    public boolean fill(boolean filled) {
        super.setFilled(filled);
        return super.isFilled();
    }
}
