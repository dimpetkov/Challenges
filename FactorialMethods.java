import java.util.Scanner;

public class FactorialMethods {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.printf("Recursive %d! = %d%n", n, factorialRecursive(n));
        System.out.printf("Iterative %d! = %d%n", n, factorialIter(n));
    }
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
    public static long factorialIter(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

