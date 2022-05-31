package PracticeWebTasks;

import java.util.Scanner;

public class MatrixBorder {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int cases = Integer.parseInt(scanner.nextLine());

        for (int test = 0; test < cases; test++) {
            String[] input = scanner.nextLine().split(" ");
            int rows = Integer.parseInt(input[0]);
            int cols = Integer.parseInt(input[1]);
            char[][] table = new char[rows][cols];

            int rowBorder = 0;
            int tempRowBorder = 0;
            int colBorder = 0;
            int tempColBorder = 0;
            char special = '#';
            //read the matrix
            for (int row = 0; row < rows; row++) {
               //fill the matrix
                String elements = scanner.nextLine();
                for (int col = 0; col < cols; col++) {
                    table[row][col] = elements.charAt(col);
                }
            }
            //check the borders -> rows
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    char x = table[i][j];
                    if (x == special) {
                        tempRowBorder++;
                        if(tempRowBorder > rowBorder) {
                            rowBorder = tempRowBorder;
                        }
                    } else {
                        tempRowBorder = 0;
                    }
                }
                tempRowBorder = 0;
            }
            //check the borders -> cols
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    char x = table[j][i];
                    if( x == special) {
                        tempColBorder++;
                        if (tempColBorder > colBorder) {
                            colBorder = tempColBorder;
                        }
                    } else {
                        tempColBorder = 0;
                    }
                }
                tempColBorder = 0;
            }
            System.out.println(Math.max(rowBorder, colBorder));
        }
    }
}
