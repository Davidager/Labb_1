package Labb1_package;

/**
 * Created by David on 01-Nov-16.
 */
public class Human {
    private int age;
    private String name;

    public String toString() {
        return "namn: " + name + ", ålder: " + String.valueOf(age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human(int the_age, String the_name) {
        age = the_age;
        name = the_name;
    }

    //public Human()
}
