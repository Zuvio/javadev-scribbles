package nl.duo.airplanes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Airplane a = new Airplane();
        a.fly();
        a.fly(4);

        String sa = "";
        sa+=2;
        sa+='c';
        sa+=false;
        System.out.println(sa);

        List<String> list = new ArrayList<String>();
        list.add("7");
        for (String s : list) System.out.println(s);

        int x = 3;
        float y = 13;
        double z = 24;
        double z2 = x*y/z;
        System.out.println(x+", "+y+", "+z+", "+z2);
    }
}
