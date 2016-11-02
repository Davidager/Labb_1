package Labb1_package;

/**
 * Created by David on 01-Nov-16.
 */
public class Human {
    private int age;
    private String name;
    private static String[] nameArray = {"Wilma", "William", "Maja", "Lucas", "Ella", "Elias", "Emma", "Oscar", "Julia",
        "Hugo", "Alice", "Viktor", "Alva", "Filip", "Linnea", "Erik", "Ida", "Emil", "Ebba", "Isak", "Elin", "Anton"};
    private static int randomAge;
    private static String randomName; // = nameArray[(int)(Math.random()*nameArray.length)];

    public String toString() {
        return "namn: " + name + ", ålder: " + String.valueOf(age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {
        this(randomAge = (int)(Math.random() * 100), randomName = nameArray[(int)(Math.random()*nameArray.length)]);


    }
}
