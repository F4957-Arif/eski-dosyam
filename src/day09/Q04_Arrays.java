package day09;

import java.util.Arrays;

public class Q04_Arrays {
    /*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */

    String s="Apex,nesne yonelimli bir programlama dilidir";
    /*
    int sesli=0;
        for (int i = 0; i < list.size(); i++) {
            sesli+=list.get(i).equals("a")||list.get(i).equals("e")||list.get(i).equals("ı")||
                    list.get(i).equals("i")||list.get(i).equals("o")||list.get(i).equals("ö")
                    ||list.get(i).equals("u")||list.get(i).equals("ü")?1:0;

        }
        System.out.println(sesli);
     */

    public static void main(String[] args) {

        /*
        String s =" Apex, nesne yonelimli bir programlama dilidir";

        String [] arr= s.split(" ");
        int sayısı=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].contains("a") || arr[i].contains("e") || arr[i].contains("i") || arr[i].contains("o") || arr[i].contains("u"))
            sayısı++;
        }
        System.out.println("istenilen harflerin sayısı = " + sayısı);

         */

        String s="Apex,nesne yonelimli bir programlama dilidir";
        s=s.replace(",","").replace(" ","");
        System.out.println("s = " + s);// Apexnesneyonelimlibirprogramlamadilidir
        String  arr[]=s.split("");
        System.out.println("arr = " + Arrays.toString(arr));//[A, p, e, x, n, e, s, n, e, y, o, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]

        String sesliHarf[]={"a","e","i","o","u"};
        System.out.println("sesliHarf = " + Arrays.toString(sesliHarf));//[a, e, i, o, u]

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <sesliHarf.length ; j++) {
                if (arr[i].equalsIgnoreCase(sesliHarf[j])){//arr dekı herhangi bir karekter sesli harflerdeki bir karektere buyuk kucuk harf farketmeksızın esıt mi?
                    sayac++;//sesli harf sayısını artır(her seferınde 1)
                }

            }

        }
        System.out.println("sayac = " + sayac);
    }
}
