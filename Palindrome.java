import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        System.out.println("the input is palindrome: " + isPalindrome(input));
        System.out.println("the input is palindrome: " + isPalindromeDeque(input));
        }

    public static boolean isPalindrome(String input) {
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            int secondChar = input.length() - i - 1;
            if(input.charAt(i) == input.charAt(secondChar)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                return false;
            }
        }
        return isPalindrome;
        }
    
    private static boolean isPalindromeDeque(String input) {
        var newDeque = new ArrayDeque<Character>();
        for (int i = 0; i < input.length(); i++) {
            newDeque.add(input.charAt(i));
        }
        boolean Palindrome = true;
        while(Palindrome) {
            if (newDeque.size() > 1) {
                char a = newDeque.pollFirst();
                char b = newDeque.pollLast();
                Palindrome = a == b;
            } else {
                break;
            }
        }

        return Palindrome;
    }
}
