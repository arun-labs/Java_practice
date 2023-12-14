package Prac;

import java.util.*;
class Solution {
    public static void twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(nums[i]+nums[j]==target){
                        System.out.println(i);
                        System.out.println(j);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int target = sc.nextInt();
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        twoSum(nums,target);
    }
}
