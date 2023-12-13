package Arrays;

public class Orted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,6,7};

        if(sorted(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean sorted(int[] arr){
//        int max = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
