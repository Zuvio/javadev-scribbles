package nl.duo.classdesign;

public class Truck extends Car {

    private double maximumLoad;
    private boolean lorry;

    public void loadTruck() {

    }

    public void unloadTruck() {

    }

    public void connectLorry() {

    }

    public void disconnectLorry() {

    }


    public double getMaximumLoad() {
        return maximumLoad;
    }
    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }
    public boolean isLorry() {
        return lorry;
    }
    public void setLorry(boolean lorry) {
        this.lorry = lorry;
    }
}
