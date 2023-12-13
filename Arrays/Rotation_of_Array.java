package Arrays;

import java.util.Scanner;

public class Rotation_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        System.out.println("Enter the rotation you want");
        String type  = sc.next();
        if(type.equals("r")){
            System.out.println("right");
            right_rot(arr);
        }else if(type.equals("l")){
            left_rot(arr);
        }

    }
    public static void left_rot(int[] arr){
        int temp=arr[0];
        int length = arr.length-1;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[length] = temp;
        printArray(arr);
    }
    public static void right_rot(int[] arr){
        int length = arr.length-1;
        int temp = arr[length];
        for(int i=1;i<length;i++){
            arr[i+1] = arr[i];

        }
        arr[0] = temp;
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }


    }
}
