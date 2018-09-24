package nl.duo.exceptions;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        //a+c+d+e

        String name = null;
        //System.out.println(name.length());
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Nullpointerrrrrr");
        }

        //System.out.println(divide(3, 0));
        try {
            System.out.println(divide(3, 0));
        } catch (ArithmeticException e) {
            System.out.println("Arithmeticcccccc");
        }

        int[] numbers = new int[]{0, 1, 2};
        //System.out.println(numbers[3]);
        for (int i = 0; i <= numbers.length; i++) {
            try {
                System.out.println(numbers[i]); //hij print [i] TOT exception
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfboundsssss");
            }
        }

        System.out.println(divide2(102,2));
        System.out.println(divide2(100,2));
        System.out.println(divide2(102,0));

        try {
            hop();
        } catch (EigenException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finallyyyyyyyyyyyy");
        }

        Integer a = new Integer(20);
        Double d = new Double(30.4);
//        d=a;
//        if (a==d)
    }

    public static int divide(int eerste, int tweede) {
        return eerste / tweede;
    }
    public static int divide2(int eerste, int tweede) {
        int resultaat=0;
        try {
            resultaat = eerste / tweede;
            return resultaat;
        } catch (ArithmeticException e) {
            resultaat = -1;
            return resultaat;
        } finally {
            if(resultaat==50) {
                return -50;
            }
            return resultaat;
        }
    }

    private static void hop() throws EigenException{
        throw new EigenException("Vaudte boel!");
    }
}