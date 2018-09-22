package kladjes;

import java.time.Period;
import java.util.*;

public class Chapter2PromotionRules {
    public static void main(String[] args) {
//
//        int x = 4;
//        long y = x * 4 - x++; //
//        4*4-4 //x=5
//        System.out.println(x+"   "+y);
//        if(y<10) System.out.println("Low");
//        else System.out.println("Right");
////        else System.out.println("High");
//        String s = null;

//        for(int i =0;i<10;) {
//            i=i+1;
//            System.out.println("Hoi");
//        }

        ArrayList list = new ArrayList(20);
        list.add("Hawk");list.add("Hawk");list.add("Hawk");list.add("Hawk");
//        list.add(19, 1);
        System.out.println(list);
        Period p = Period.ofYears(1);


        StringBuilder str1 = new StringBuilder("abc");
//        str1 = str1.concat("lol");
        str1.append("lol");
        System.out.println(str1);
        System.out.println(str1.substring(2,4));
        System.out.println(str1);
        str1.substring(2,4);
        System.out.println("substringed: "+str1);

        String aa = new String("abc");
        String bb = aa.concat("de");
        bb = bb.concat("fg");
        System.out.println(aa);
        System.out.println(bb);

        String name = "Fluffy";
        String name2 = new String("Fluffy");
        System.out.println("Does it contain 'luff': "+name.contains("luff"));
        System.out.println("Does it start with 'luff': "+name.startsWith("luff"));

        int a = 1 % 2;
        System.out.println(a);
        final char grade = 'B';
        switch (grade) {
            case 'B':
                System.out.println("you"); break;
            default:
                System.out.println("doet ie niet");
//                break;

                int[] numbers = new int[] {1,2,3};



        }

        String[] array1=new String[2];
        String[] array2=new String[2];
        array1[0]="hoi1";
        array1[1]="hoi2";
        array2[0]="hoi1";
        array2[1]="hoi2";
        if(array1==array2) System.out.println("== arrays"); else System.out.println("arrays niet ==");
        if (array1.equals(array2)) System.out.println("equals arrays"); else System.out.println("arrays niet equals()");

        List<String> bla = new ArrayList<>();
        List<String> bla2 = new ArrayList<String>();
        bla.add("abc");
        bla2.add("abc");
        if (bla==bla2) System.out.println("==");
        else if(bla.equals(bla2)) System.out.println("equals");
        else System.out.println("nope");

        char[]c=new char[2];
        int[][] intarray1=new int[21][];

        List<Integer> list2 = Arrays.asList(10,4,-1,05);
        Collections.sort(list2);
//        Integer array[] = list.toArray(new Integer[4]);

    }
}