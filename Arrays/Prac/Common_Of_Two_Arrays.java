package Prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Common_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,4,5,6,7,8};

        common(arr1,arr2);
    }
    public static void common(int[] arr1,int arr2[]){
        List<Integer> al1 = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   al1.add(arr1[i]);
                }
            }
        }
        System.out.println(al1);
    }
}
