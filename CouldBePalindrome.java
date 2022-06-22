package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CouldBePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("the input could be a palindrome: " + couldBePalindrome(input));
        }

    private static boolean couldBePalindrome(String input) {
        int counterOdds = 0;
        boolean couldBePalindrom = true;
        List<Character> inputArray = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            inputArray.add(input.charAt(i));
        }
        for (int i = 0; i < inputArray.size(); i++) {
            int internalCounter = 1;
            for (int j = 0; j < inputArray.size(); j++) {
                if(i != j && inputArray.get(i) == inputArray.get(j)) {
                    internalCounter++;
                    inputArray.remove(j);
                    j--;
                }
            }
            if(internalCounter % 2 != 0) {
                if(counterOdds > 0) {
                    return false;
                } else {
                    counterOdds++;
                }
            }
            internalCounter = 1;
        }
        return  couldBePalindrom;
    }
}
