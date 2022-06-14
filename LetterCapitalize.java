import java.util.*;

public class LetterCapitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(FirstLetterCapitalize(scanner.nextLine()));
    }
    
    public static String FirstLetterCapitalize(String str) {
        String[] input = str.split(" ");
        List<String> result = new ArrayList<>();
        for (String element : input) {
            result.add(capitalize(element));
        }
        str = String.join(" ", result);
        return str;
    }
    
    private static String capitalize(String word) {
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        return word;
    }
}
