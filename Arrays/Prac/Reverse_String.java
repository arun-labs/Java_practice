package Prac;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 =  sc.nextLine();
        System.out.println(s1);
        String res = rev_str(s1);
        System.out.println(res);

    }
    public static String rev_str(String s1){
        String reversed = "";
        for(int i =s1.length()-1;i>=0;i--){
            reversed += s1.charAt(i);
        }
        return reversed;
    }
}
