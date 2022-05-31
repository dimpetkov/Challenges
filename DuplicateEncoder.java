package PracticeWebTasks;

import java.util.Locale;

public class DuplicateEncoder {
    static String encode(String word) {
        //Single appearance -> return "("
        //More than one appearance -> return ")"
        word = word.toLowerCase();
        String newWord = "";
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (word.lastIndexOf(ch) == word.indexOf(ch)){
                newWord = newWord.concat("(");
            } else {
                newWord = newWord.concat(")");
            }
        }
        word = newWord;
        return word;
    }
}
