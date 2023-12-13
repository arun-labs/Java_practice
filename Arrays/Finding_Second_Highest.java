package Arrays;

import java.util.Scanner;

public class Finding_Second_Highest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int res=find_Sec(arr);
        System.out.println(res);
    }
    public static int find_Sec(int[] arr){
        int max = Integer.MAX_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max = arr[i];
            }else if(arr[i]<max && arr[i]>sec_max){
                sec_max = arr[i];
            }
        }
        return sec_max;
    }
}
