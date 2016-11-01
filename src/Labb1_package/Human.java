package Labb1_package;

/**
 * Created by David on 01-Nov-16.
 */
public class Human {
    private Integer age;
    private String name;

    public String toString() {
        return "namn: " + name + ", ålder: " + age.toString();
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human(Integer the_age, String the_name) {
        age = the_age;
        name = the_name;
    }
}
