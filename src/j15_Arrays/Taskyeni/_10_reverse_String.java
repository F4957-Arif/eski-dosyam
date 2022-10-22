package j15_Arrays.Taskyeni;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str10 = "Hello World";
        String arr10[]=str10.split("");
        for(int i = arr10.length-1 ; i>=0 ; i--) {
            System.out.print(arr10[i] + " ");

        }


    }
}