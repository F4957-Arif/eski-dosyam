package Interview_Questıons.Day01;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    /*
    Scanner scan = new Scanner(System.in);              FArklı cozum
System.out.print("Bir ifade giriniz  :");
String str = scan.nextLine();
System.out.println("Bir sayı giriniz : ");
int sayi = scan.nextInt();
for(int i=1;i<=sayi;i++) {
	System.out.print(""+str.charAt(0) + str.charAt(str.length()-1));}
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen metin gitiniz : ");
        String str= sc.nextLine();
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi= sc.nextInt();


        System.out.println("ilkSonHarf(str,sayi) = " + ilkSonHarf(str, sayi));


    }

    private static String  ilkSonHarf(String str, int sayi) {

        String ilkSonHarfler=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println("ilkSonHarfler = " + ilkSonHarfler);


        String output="";
        for (int i = 0; i <sayi ; i++) {//birleşimden kactane yazdıracaksam onu bana verır
            output+=ilkSonHarfler;

        }
return output;
    }


}
