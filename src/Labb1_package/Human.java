package Labb1_package;

/**
 * Created by David on 01-Nov-16.
 */
public class Human {
    private int age;
    private String name;
    private static String[] nameArray = {"Wilma", "William", "Maja", "Lucas", "Ella", "Elias", "Emma", "Oscar", "Julia",
        "Hugo", "Alice", "Viktor", "Alva", "Filip", "Linnea", "Erik", "Ida", "Emil", "Ebba", "Isak", "Elin", "Anton"};

    public static String generateRandomName() {
        return nameArray[(int)(Math.random()*nameArray.length)];
    }

    public String toString() {
        return "namn: " + name + ", ålder: " + String.valueOf(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {
        this((int)(Math.random() * 100), generateRandomName());


    }
}
