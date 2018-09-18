package nl.duo.classdesign;

public class Car {
    private int mileage;
    private String licenseplate;
    private int numberOfWheels;
    private String engineType;
    private double speed;

    public void drive(int distance) {
        this.mileage = distance;
    }

    public String honk(boolean traffic) {
        String honk="";
        if(traffic == true) {
            honk = "HONK!!";
            System.out.println(honk);
        }
        return honk;
    }

    public int getMileage() {
        return mileage;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public String getLicenseplate() {
        return licenseplate;
    }
    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


}
