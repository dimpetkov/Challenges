public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = new int[10]; //example array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        reverse(arr, 4, 8); //reverse elements from index 4 to index 8

    }
    public static int[] reverse(int[] arr, int i, int j) {
        int[] reversedArr = new int[arr.length];

        for (int k = 0; k < arr.length; k++) {
            if (k < i || k > j) {
                reversedArr[k] = arr[k];
            } else {
                reversedArr[k] = arr[j - (k - i)];
            }
            System.out.print(reversedArr[k] + " ");
        }


        return reversedArr;
    }


}

