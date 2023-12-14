package Prac;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fi =0;
        int fi1 = 1;
        int inp = sc.nextInt();

        System.out.print(fi+" "+fi1+" ");
        for(int i=1;i<=inp;i++){
            int sum = fi+fi1;
            System.out.print(sum+" ");
            fi=fi1;
            fi1=sum;

        }

    }
}
