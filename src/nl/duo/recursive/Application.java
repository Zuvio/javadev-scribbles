package nl.duo.recursive;

public class Application {
    public static void main(String[] args) {
        Recursive r = new Recursive();
        r.fac(5);
        System.out.println(Recursive.fac(6));
    }
}
