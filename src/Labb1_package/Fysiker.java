package Labb1_package;

/**
 * Created by Dexter on 2016-11-02.
 */
public class Fysiker extends Human {
    private int year;

    public Fysiker(int year){
        this.year = year;
    }
    public Fysiker(){
        this((int)(1932 + Math.random()*83));
    }
    public int getYear(){
         return (int)(1932 + Math.random()*83);
    }
}
