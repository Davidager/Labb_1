package Labb1_package;
import java.util.Arrays;
/**
 * Created by David on 06-Nov-16.
 */
public class UppgiftE5 {
    public static void main(String[] args) {
        Fysiker_da a = new Fysiker_da();  // E5.2
        Human b = new Human();
        if (a.compareTo(b) > 0) {
            System.out.println(a.getName() + ", som är " + a.getAge() + " år, är äldre än " + b.getName() + ", som är " + b.getAge() + " år.");
        } else if (a.compareTo(b) < 0) {
            System.out.println(a.getName() + ", som är " + a.getAge() + " år, är yngre än " + b.getName() + ", som är " + b.getAge() + " år.");
        } else {
            System.out.println(a.getName() + ", som är " + a.getAge() + " år, är lika gammal som " + b.getName() + ", som är " + b.getAge() + " år.");
        }
        System.out.println();

        Human[] humfysArray = new Human[10];    // E5.4
        for (int i=0; i<5; i++) {
            humfysArray[i] = new Human();
        }
        for (int i=5; i<10; i++) {
            humfysArray[i] = new Fysiker_da();
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
