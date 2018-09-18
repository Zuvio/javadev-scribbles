package nl.duo.classdesign;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(8);
        car.honk(true);

        System.out.println(car.getMileage()+" km driven");

        Sportscar racer = new Sportscar();
        racer.setSpeedOMeter(45.4);
            racer.turbo(3);
        System.out.println(racer.getSpeedOMeter()+"km/u!! Geen idee wat de turboboost is... //geprint uit main()");

    }
}
