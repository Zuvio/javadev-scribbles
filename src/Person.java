public class Person {

    private int sal;

    public Person(int sal) {
        this.sal = sal;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person andere = (Person) o;

            boolean result = this.sal == andere.sal;

            return result;
        } else {
            return false;
        }
    }
}
