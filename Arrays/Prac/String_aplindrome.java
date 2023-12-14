package Prac;

import java.util.Scanner;

public class String_aplindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        if(palin(s1)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
    public static boolean palin(String s1){
        String s2 = "";
        int left = 0;
        int right = s1.length()-1;
        while (left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            else{
                left = left +1;
                right = right -1;

            }


        }
        return true;
    }
}
