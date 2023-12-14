package Prac;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        boolean res = palin(inp);
        if(res==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
    public static boolean palin(String inp){
        int len  = inp.length();
        System.out.println(len);
        for(int i=0;i<inp.length()/2;i++){
            if(inp.charAt(i)!=inp.charAt(len-i-1)){
                return false;
            }

        }
        return true;

    }
}
