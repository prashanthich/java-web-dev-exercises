package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args){
        countByCharacter();
    }
    public static void countByCharacter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> charKey = new HashMap<>();
        for(char c: chars){
            c = Character.toLowerCase(c);
            int ascii = c;
            System.out.println(ascii);
            if(c >= 97 && c <= 122){
                if(charKey.containsKey(c)){
                    charKey.put(c, charKey.get(c) + 1);
                } else {
                    charKey.put(c, 1);
                }
            }
        }
        System.out.println(charKey.size());
        for(Map.Entry<Character, Integer> map: charKey.entrySet()){
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }
}
