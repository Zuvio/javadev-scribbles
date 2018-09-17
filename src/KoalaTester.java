public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);
        System.out.println("Printed from KoalaTester: "+Koala.count);

        Koala k = new Koala();
        System.out.println("Printed as an object k of Koala: "+k.count);
        k = null;
        System.out.println("Printed as an object k of Koala after nulling reference k: "+k.count);
    }
}
