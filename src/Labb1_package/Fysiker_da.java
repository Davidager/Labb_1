package Labb1_package;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Created by David on 03-Nov-16.
 */
public class Fysiker_da extends Human {
    private int year;

    public int getYear()  {
        return year;
    }

    public String toString() {
        return super.toString() + ", började Fysik " + String.valueOf(year);
    }

    public Fysiker_da(int age, String name, int year) {
        super(age, name);
        if ((year < 1932) | (year > 2016)) {
            throw new IllegalArgumentException("Det finns inga fysiker som börjat " + year);
        } else if ((2016 - age) + 15 > year) { // Måste vara minst 15 för att kunna börja plugga
            throw new IllegalArgumentException("Fysiker kan inte vara / ha varit yngre än 14 år");
        }
        this.year = year;
    }

    public Fysiker_da() {
        int age = ThreadLocalRandom.current().nextInt(15, 101);  //  slumpar tillåten ålder (mellan 15 och 100)
        setAge(age);
        setNameRandom();
        year = ThreadLocalRandom.current().nextInt((2016 - age) + 15, 2017);   // slumpar tillåten årgång (med hänsyn till ålder)
    }

}
