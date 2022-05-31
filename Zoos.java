package PracticeWebTasks;

import java.util.Locale;
import java.util.Scanner;

public class ZooWordValid {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine().toLowerCase(Locale.ROOT);
            boolean zoo = true;

            int zs = 0;
            int os = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'z') {
                zs++;
            } else if (input.charAt(i) == 'o') {
                os++;
            } else {
                zoo = false;
            }
        }
        if(2 * zs != os) {
            zoo = false;
        }
        if (zoo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
