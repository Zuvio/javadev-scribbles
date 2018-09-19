package nl.duo.recursive;

public class Recursive {
    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}