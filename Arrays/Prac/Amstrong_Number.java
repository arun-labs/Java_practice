package Prac;

import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp  = sc.nextInt();

        if( Amst(inp)==true){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean Amst(int inp){
        int dum = inp;
        int sum=0;
        while(inp>0){
           int temp = (inp%10);
           int pow = (int) Math.pow(temp,3);
           sum=sum+pow;
           inp=inp/10;

        }
        if(dum==sum){
            return true;
        }else{
            return false;
        }
    }
}
