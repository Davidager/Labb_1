package Labb1_package;

import java.util.Arrays;

/**
 * Created by David on 02-Nov-16.
 */
public class uppgiftE3 {

    public static void main(String[] args) {
        Human[] humanArray = new Human[15];
        for(int i=0; i<15; i++) {
            humanArray[i] = new Human();
        }
        System.out.println(Arrays.toString(humanArray));
    }
}
