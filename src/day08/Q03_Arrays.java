package day08;

import java.util.Arrays;

public class Q03_Arrays {
    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )


     */
    public static void main(String[] args) {
        //1.Yol
        String str="HeySiri";

        //2.Yol
        str=str.replace("Hey","Bye");
        System.out.println("str = " + str);
        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));

        //Baska Yol:
        String str1="HeySiri";
        String yeniStr[]=str1.split("y");
        yeniStr[0]="Bye";
        str1 =yeniStr[0]+yeniStr[1];
        System.out.println("str1 = " + str1);
        String arr2[]=new String[1];
        arr2[0]=str1;
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }

}
