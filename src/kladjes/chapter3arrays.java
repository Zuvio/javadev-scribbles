package kladjes;

import java.util.Arrays;

public class chapter3arrays {
    public static void main(String[] args) {
        String[] ar1 = {"hoi1","hoi2","hoi3","hoi4"};
        String[] ar2 = {"hoi1","hoi2","hoi3","hoi4"};
        String[] ar3 = ar1;
        System.out.print("ar1==ar2 : ");
        System.out.println(ar1==ar2);

        System.out.print("ar1 equals ar2 : ");
        System.out.println(ar1.equals(ar2));

        System.out.print("ar1==ar3 : ");
        System.out.println(ar1==ar3);

        System.out.print("ar1 equals ar3 : ");
        System.out.println(ar1.equals(ar3));

        System.out.println(Arrays.equals(ar1,ar2));
    }
}
