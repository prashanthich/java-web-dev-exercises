package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = input.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = input.nextFloat();
        float area = length * width;
        System.out.println(area);

    }
}
