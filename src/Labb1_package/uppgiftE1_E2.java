package Labb1_package;

/**
 * Created by David on 01-Nov-16.
 */
public class uppgiftE1_E2 {

    public static void main(String[] args){
        Human human1 = new Human(21, "David");
        System.out.println(human1.toString());
        System.out.println(human1.getAge());
        System.out.println(human1.getName());

        Human putte = new Human(25,"Putte");
        System.out.println(putte);
    }
}
