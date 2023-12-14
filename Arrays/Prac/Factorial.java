package Prac;

import java.util.Scanner;

//import static java.lang.VersionProps.print;
//import static java.lang.VersionProps.println;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));


    }
    public static int fact(int num){
        int fact = 1;
        for(int i=num;i>0;i--){
            fact =fact*i;
        }
        return fact;
    }
}
