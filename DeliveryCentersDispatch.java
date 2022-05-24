package ***Assessment;

import java.io.*;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result{
    
    public static int getMinimumDays(List<Integer> parcels) {
        //Write your code here
        int[]newArr = new int[parcels.size()];
        for (int i = 0; i < parcels.size(); i++) {
            newArr[i] = parcels.get(i);
        }
        boolean allDelivered = true;
        int countDays = 0;
        while(allDelivered) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] != 0 && newArr[i] < min) {
                    min = newArr[i];
                }
            }
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] != 0 && newArr[i] >= min) {
                    newArr[i] -= min;
                } else if (newArr[i] != 0 && newArr[i] < min) {
                    newArr[i] = 0;
                }
            }
            countDays++;
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] > 0) {
                    allDelivered = false;
                    break;
                }
            }
            if (allDelivered) {
                return countDays;
            } else {
                allDelivered = true;
            }
        }
        return 0;
    }
}
public class Solution {
   public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       
       int parcelsCount = Integer.parseInt(bufferedReader.readLine().trim());
       
       List<Integer> parcels = IntStream.range(0, parcelsCount).mapToObj(i -> {
           try {
               return bufferedReader.readLine().replaceAll("\\s+$", "");
           } catch (IOException ex) {
               throw new RuntimeException(ex);
           }
       })
               .map(String::trim)
               .map(Integer::parseInt)
               .collect(toList());
       
       int result = Result.getMinimumDays(parcels);
       
       bufferedWriter.write(String.valueOf(result));
       bufferedWriter.newLine();
       
       bufferedReader.close();
       bufferedWriter.close();
   }
}
