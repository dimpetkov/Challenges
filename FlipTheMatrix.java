import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    int n = matrix.size();
        int[][] newMatrix = new int[n][n];
        int sumMax = 0;


        //make and fill new int[][] matrix
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> data = matrix.get(i);
            for (int j = 0; j < data.size(); j++) {
                newMatrix[i][j] = data.get(j);
            }
        }
        int maxElement = 0;
        for (int i = 0; i < newMatrix.length / 2; i++) {
            for (int j = 0; j < newMatrix.length / 2; j++) {
                maxElement = newMatrix[i][j];
                if (newMatrix[i][n - j - 1] > maxElement) {
                    maxElement = newMatrix[i][n - j - 1];
                }
                if (newMatrix[n - i - 1][j] > maxElement) {
                    maxElement = newMatrix[n - i - 1][j];
                }
                if (newMatrix[n - i - 1][n - j - 1] > maxElement) {
                    maxElement = newMatrix[n - i - 1][n - j - 1];
                }
                sumMax += maxElement;
                maxElement = 0;
            }
        }
        return sumMax;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
