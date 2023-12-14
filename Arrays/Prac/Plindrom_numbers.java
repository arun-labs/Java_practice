package Prac;

import java.util.Scanner;

public class Plindrom_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        boolean res = ispali(inp);
        if(res){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean ispali(int num){
        int temp=num;
        int temp2;
        int ans=0;
        while(temp!=0){
            temp2=temp%10;
            ans = ans*10+temp2;
            temp=temp/10;
        }
        System.out.println(ans);
        if(ans==num){
            return true;
        }else{
            return false;
        }
    }
}
