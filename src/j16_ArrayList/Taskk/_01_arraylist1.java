package j16_ArrayList.Taskk;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        String str="Orange";

        System.out.println(str.toUpperCase()+ " kelimesi Arrayn içinde = " + getCount(arr, str)+ " tane var ");//ORANGE kelimesi Arrayn içinde = 2 tane var


    }

    private static int getCount(ArrayList<String> arr, String str) {
        int count=0;
        for (String s:arr) {
            if (str.equalsIgnoreCase(s)){
                count++;
            }

        }
        return count;
    }
}
