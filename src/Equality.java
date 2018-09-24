public class Equality {
    public static void main(String[] args) {
        Person a = new Person(3500);
        Person b = new Person(3501);

        if (a.equals(b)) {
            System.out.println("A is semantisch gelijk aan B");
        } else {
            System.out.println("A is NIET semantisch gelijk aan B");
        }
    }
}
