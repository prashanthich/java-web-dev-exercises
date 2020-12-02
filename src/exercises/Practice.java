package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        countByCharacter();

    }

    public static void countByCharacter() {
        // System.out.println("Counting characters");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> charKey = new HashMap<>();
        for (char c : chars) {
            c = Character.toLowerCase(c);
            int ascii = c;
            System.out.println(ascii);
            if (c >= 97 && c <= 122) {
                if (charKey.containsKey(c)) {
                    charKey.put(c, charKey.get(c) + 1);
                } else {
                    charKey.put(c, 1);
                }
            }
            //System.out.println(c);
        }
        System.out.println(charKey.size());
        for (Map.Entry<Character, Integer> map : charKey.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }

    public static void myPractice() {
        for (int i = 1; i < 100; i = i + 1) {
            // System.out.println(i*3);
        }
        //For each
        int nums[] = {1, 2, 3, 5, 3, 4, 2, 4, 5, 7, 7, 90, 10, 90};
        for (int i : nums) {
            //System.out.println(i);
        }
        String names[] = {"karth", "yashu", "shanthi", "santhu", "chirunomula"};
        String searchTerm = "yashu";
        for (String name : names) {
            if (searchTerm == name) {
                System.out.println("Found Name in for Loop!");
                continue;
            }
            System.out.println("Not here");
            // System.out.println("Hello " + name);
        }
        for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i]);
        }
        String msg = "Hello World!";
        for (char c : msg.toCharArray()) {
            // System.out.println(c);
        }

        int i = 0;
        while (i < names.length) {
            if (searchTerm == names[i]) {
                System.out.println("Found The Name");
                break;
            }
            System.out.println(names[i]);
            i++;
        }
        int x = 0;
        do {
            // System.out.println(names[x]);
            x++;
        } while (x < names.length);
    }
}
