package nl.duo.abstractdesign;

public abstract class Vehicle implements Fillable {
    private int mileage;
    private boolean filled;

    public abstract int drive(int distance);
    public abstract boolean fill(boolean filled);

    int getMileage() {
        return mileage;
    }
    void setMileage(int mileage) {
        this.mileage = mileage;
    }
    boolean isFilled() {
        return filled;
    }
    void setFilled(boolean filled) {
        this.filled = filled;
    }
}
