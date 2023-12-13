package Arrays;

import java.util.ArrayList;

public class Making_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-5,-4,6};
        subArray(arr);
    }
    public static void subArray(int[] arr){
        int len = arr.length;
        ArrayList<Integer> sol = new ArrayList<>();
        for(int start=0;start<len;start++){
            for(int end=start;end<len;end++){
//                System.out.print("[");
                for(int i=start;i<=end;i++){
                    sol.add(arr[i]);
//                    System.out.print(arr[i]+" ");
                }
                int sum = sumArray(sol);
//                System.out.println("]");
                System.out.println(sum);
            }
        }
    }
    public static int sumArray(ArrayList<Integer> l1){
        int sum = 0;
        for(int i=0;i<l1.size();i++){
            sum=sum+l1.get(i);
        }
        return sum;
    }
}
