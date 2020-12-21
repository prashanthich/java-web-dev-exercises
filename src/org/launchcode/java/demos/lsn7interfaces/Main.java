package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        System.out.println("Before:" + "\n");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        flavors.sort(comparator);
        System.out.println("\n" + "After:" + "\n");
        for(Flavor flavor: flavors) {
            System.out.println(flavor.getName());
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

    }
}
