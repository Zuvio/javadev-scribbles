package nl.duo.classdesign;

public class Sportscar extends Car {
        private double speedOMeter;

    public double turbo(int turboboost){
        speedOMeter=speedOMeter*turboboost;
        System.out.println(speedOMeter+"x harder!!! //geprint uit turbo()");
        return speedOMeter;
    }

    public double getSpeedOMeter() {
        return speedOMeter;
    }
    public void setSpeedOMeter(double speedOMeter) {
        this.speedOMeter = speedOMeter;
    }
}
