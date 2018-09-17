package nl.duo.koalas;

import nl.duo.koalas.Koala;

public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);
        System.out.println("Printed from KoalaTester: "+Koala.count);

        Koala k = new Koala();
        System.out.println("Printed as an object k of Koala: "+k.count);
        k = null;
        System.out.println("Printed as an object k of Koala after nulling reference k: "+k.count);
        Koala.count=4;
        System.out.println("Printed after setting Koala.count to 4: "+k.count);
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        System.out.println("Printed after setting koala1.count to 6: "+k.count);
        koala2.count = 5;
        System.out.println("Printed after setting koala2.count to 5: "+k.count);
    }
}
