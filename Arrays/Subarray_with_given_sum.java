package Arrays;

import java.util.Scanner;

public class Subarray_with_given_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Enter the sum");
        int sum = sc.nextInt();

        // Call the method to find subarrays with the given sum
        values(arr1, sum);
    }

    public static void values(int[] arr1, int sum) {
        for (int i = 0; i < arr1.length; i++) {
            int currentSum = 0;

            // Iterate over subarrays starting from index i
            for (int j = i; j < arr1.length; j++) {
                currentSum += arr1[j];

                // If the current subarray sum is equal to the target sum, print the indices
                if (currentSum == sum) {
                    System.out.println("Subarray with sum " + sum + " found from index " + i + " to " + j);
                }
            }
        }
    }
}
