package day09;

public class Q02_Arrays {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        /*
        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[] arr=str.replace(" ","").split("");
        System.out.println("Karakter sayısı = "+arr.length);
         */

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz";
        System.out.println("str.replace(\" \",\"\").length() = " + str.replace(" ", "").length());

        //2.YOl
        String arr[]=str.replace(" ","").split("");
        System.out.println("arr.length = " + arr.length);

        //3.yol

    }

}
