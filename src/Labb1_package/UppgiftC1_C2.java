package Labb1_package;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by David on 06-Nov-16.
 */
public class UppgiftC1_C2 {
    public static void main(String[] args) {
        Human[] humfysArray = new Human[10];
        for (int i=0; i<5; i++) {
            humfysArray[i] = new Human();
        }
        for (int i=5; i<10; i++) {
            humfysArray[i] = new Fysiker_da(66,"person" + String.valueOf(i), ThreadLocalRandom.current().nextInt((2016 - 66) + 15, 2017));
        }
        for (Human item : humfysArray) {
            System.out.println(item);
        }

        Arrays.sort(humfysArray);
        System.out.println();

        for (Human item : humfysArray) {
            System.out.println(item);
        }
    }
}
