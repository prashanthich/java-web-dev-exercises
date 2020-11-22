package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String adventure = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";

        //String adventure = "I am learning Java";

        System.out.println("Enter Alice's Adventure");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        boolean isExist = adventure.toLowerCase().contains(search.toLowerCase());

        System.out.println(isExist);
        if(isExist){
            int indexOfSearch = adventure.toLowerCase().indexOf(search.toLowerCase());
            System.out.println(indexOfSearch);
            String str1 = adventure.substring(0,indexOfSearch-1);
            String str2 = adventure.substring(indexOfSearch + search.length());
            String str3 =str1 + str2;
            System.out.println(str3);
        }
    }
}
