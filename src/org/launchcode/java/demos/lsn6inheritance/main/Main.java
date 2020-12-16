package org.launchcode.java.demos.lsn6inheritance.main;

import org.launchcode.java.demos.lsn6inheritance.main.Cat;
import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield", 12);
       // garfield.eat();
        System.out.println(garfield.isTired());
        HouseCat xxx = new HouseCat("Sharly");
        xxx.setHungry(true);
        System.out.println(xxx.noise());
        Cat catObj = new Cat(15.8);
       // System.out.println(catObj.noise());

        Cat cat1 = new HouseCat("Sunny",25);
        System.out.println(((HouseCat) cat1).isSatisfied());
    }
}
