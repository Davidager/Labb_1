package Labb1_package;

import java.util.Arrays;

/**
 * Created by David on 03-Nov-16.
 */
public class UppgiftE4 {
    public static void main(String[] args) {
        Fysiker_da[] fysikerArray = new Fysiker_da[15];
        for (int i=0; i<15; i++) {
            fysikerArray[i] = new Fysiker_da();
        }
        for (Fysiker_da item : fysikerArray) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Array 2:");
        System.out.println();

        Human[] humfysArray = new Human[10];
        for (int i=0; i<5; i++) {
            humfysArray[i] = new Human();
        }
        for (int i=5; i<10; i++) {
            humfysArray[i] = new Fysiker_da();
        }
        for (Human item : humfysArray) {
            System.out.println(item);
        }
    }
}
