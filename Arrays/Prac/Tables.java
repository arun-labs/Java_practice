package Prac;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int temp;
        for(int i=1;i<=10;i++){
            temp=inp*i;
            System.out.println(inp+" * "+i+" ="+temp);
        }
    }
}
