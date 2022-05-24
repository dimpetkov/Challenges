package ***Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShipmentWeightBalancing {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k = Integer.parseInt(scanner.nextLine());
            int sizeN = Integer.parseInt(scanner.nextLine());
            List<Integer> weights = new ArrayList<>();

        for (int i = 0; i < sizeN; i++) {
            int item = scanner.nextInt();
            weights.add(item);
        }
        int loadsCount = 0;
        for (int i = 0; i < weights.size(); i++) {
            for (int j = 0; j < weights.size(); j++) {
                if (Math.abs(weights.get(i) - weights.get(j)) > k) {
                    break;
                } else {
                    loadsCount++;
                }
            }
        }
        System.out.println(loadsCount);
        }
}
