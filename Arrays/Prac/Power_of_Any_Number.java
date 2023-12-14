package Prac;

import java.util.Scanner;

public class Power_of_Any_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int pow = sc.nextInt();
        power(inp,pow);

    }
    public static void power(int num,int pow){
        int temp=1;
        for(int i=1;i<=pow;i++){
            temp = temp*num;
        }
        System.out.println(temp);
    }
}
