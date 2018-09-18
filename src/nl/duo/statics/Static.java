package nl.duo.statics;

public class Static {
    private String name= "Static class";
    public static void first() {};
    public static void second() {};
    public void third() {System.out.println(name); }

    public static void main(String[] args) {
        first();
        second();
        new Static().third();

        int number = 1;
        number(number);         //number is not being reassigned here
        //number=number(number);//now number is being reassigned!
        System.out.println(number);
    }

    public static int number(int number) {
        number+=20;
        return number;
    }



}
