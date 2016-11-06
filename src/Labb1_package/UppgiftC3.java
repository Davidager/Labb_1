package Labb1_package;
import java.util.Arrays;
/**
 * Created by David on 06-Nov-16.
 */
public class UppgiftC3 {
    public static void main(String[] args) {
        Human[] personArray = new Human[(args.length/2)]; // skapar array med plats för maximala antalet personer ( om alla vore human)
        int indexInPersonArray = 0;
        int indexInArgs = 0;
        for (String item : args) {
            try {
                if (item.equals("-H")) {
                    personArray[indexInPersonArray] = new Human(Integer.parseInt(args[indexInArgs + 2]), args[indexInArgs + 1]);
                    indexInPersonArray++;
                } else if (item.equals("-F")) {
                    int year1;
                    int year2 = Integer.parseInt(args[indexInArgs + 3]);
                    if (year2 > 16) {    // i detta fallet handlar det om 1900-talet
                        year1 = 19;
                    } else {           // annars 2000-talet
                        year1 = 20;
                    }
                    personArray[indexInPersonArray] = new Fysiker_da(Integer.parseInt(args[indexInArgs + 2]), args[indexInArgs + 1], (year1 * 100) + year2);
                    indexInPersonArray++;
                }
                indexInArgs++;
            } catch (NumberFormatException e) {
                System.out.println("Fel input!");
                System.exit(0);
            }
        }

        int nullIndex = 0;  // hittar index för första tomma arrayplatsen
        for (Human item : personArray) {
            if (item == null) {
                break;
            }
            nullIndex++;
        }
        personArray = Arrays.copyOfRange(personArray,0,nullIndex);   // skapar kopia av listan med endast fyllda platser

        for (Human item : personArray) {
            System.out.println(item);
        }
    }
}
