package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        Comparator comparator = new FlavorComparator();

        System.out.println("Before:" + "\n");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName() + " ,allergens count: " + flavor.getAllergens().size());
        }

        flavors.sort(comparator);
        System.out.println("\n" + "After:" + "\n");
        for(Flavor flavor: flavors) {
            System.out.println(flavor.getName() + " ,allergens count: " + flavor.getAllergens().size());
        }

        System.out.println("Before cone sort:");
        for (Cone cone: cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        cones.sort(new ConeComparator());
        System.out.println("After cone sort:");
        for (Cone cone: cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        System.out.println("Before Topping Sort:");
        for(Topping topping: toppings){
            System.out.println(topping.getName());
        }
        toppings.sort(new ToppingComparator());
        System.out.println("After Topping Sort:");
        for (Topping topping: toppings){
            System.out.println(topping.getName());
        }
    }
}
