package Day06;

import java.util.Scanner;

public class Q06_Forloop {
    public static void main(String[] args) {

        /* Interview Question
 Write a Java program to reverse a string. Use for loop and create a method called
  reverseString */

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir string ifade giriniz :");
        String str= scan.nextLine();
        System.out.println(reverseString(str));


    }

    private static String reverseString(String str) {
        String tersSTr = "";

        for (int i = str.length()-1; i>=0 ; i--) {
            tersSTr+=str.charAt(i);

        }
        return tersSTr;
    }
}
