//Java Implementation
import java.util.*;

public class Main {

    static void selectionSort(int[] arr) {

        int n = arr.length;

        // Move through each position
        for (int i = 0; i < n - 1; i++) {

            // Assume current position has the minimum
            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        selectionSort(arr);

        // Print sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
