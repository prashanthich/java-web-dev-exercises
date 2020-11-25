package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(4);
        numbers.add(3);
        numbers.add(22);
        System.out.println(sumOfEvens(numbers));

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArr = str.split(" ");
        ArrayList<String> strWords = new ArrayList<>(Arrays.asList(strArr));
        System.out.println("Enter the word length for search: ");
        int wordSearchLength = input.nextInt();
        fiveLetterWords(strWords, wordSearchLength);
    }

    public static Integer sumOfEvens(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(ArrayList<String> words, int wordLength) {
        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
