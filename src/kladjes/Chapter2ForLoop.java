package kladjes;

import org.junit.Test;

public class Chapter2ForLoop {
    @Test
    public void lolTest() {
    int i;
        for (i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Outside the for loop: "+i);
    }
}
