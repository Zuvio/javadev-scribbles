package nl.duo.abstractdesign;

public class Application {
    public static void main(String[] args) {
        Vehicle bike = new Motorbike();

        bike.drive(5);
        System.out.println("Distance travelled: "+bike.getMileage());
        bike.fill(true);
        System.out.println("Tank is filled: "+bike.isFilled());
    }
}

