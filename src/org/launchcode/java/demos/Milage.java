package org.launchcode.java.demos;

import java.util.Scanner;

public class Milage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your miles:" );
        int miles = input.nextInt();
        System.out.println("Enter your gallons: ");
        int gallons = input.nextInt();
        int milesPerGallons = miles / gallons;
        System.out.println(milesPerGallons);
    }
}
