package nl.duo.airplanes;

public class Airplane {
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void fly() {
        this.setMileage(++mileage);
        System.out.println("Mileage++: "+getMileage());
    }

    public void fly(int m) {
        this.setMileage(mileage += m);
        System.out.println("Mileage+=m: "+getMileage());
    }

}
