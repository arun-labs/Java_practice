package Arrays;

public class Sorting_array {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3,7,8,11};
        sort(arr);
    }
    public static void sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int temp;
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arr);

    }
}
