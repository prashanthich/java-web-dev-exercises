package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.skip("\n");
        System.out.println(getArea(radius));
    }

    public static Double getArea(Double radius){
        return 3.14 * radius * radius;

    }
}
