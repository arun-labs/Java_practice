package Arrays;

import java.util.Scanner;

public class Counting_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,5,6};
        count_trip(arr);

    }
    public static void count_trip(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i= 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                for(int k=0;k<arr.length;k++){
                    if(sum == arr[k]){
                       count++;
                    }
                }

            }
        }
        System.out.println(count);

    }
}
