package Interview_Questıons.Day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String str = sc.nextLine();

        //Split methodu kullanacagız
        String arr[] = str.split("");//her bir karekteri ayırır
        System.out.println(Arrays.toString(arr));//once yazıralaım kontrol edelım

        //short sıralayalım
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//Count=sayac olustur

        int counter = 0;

        //karekter karsılastırmak ıcın for loop
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {//tek sayıdakı karekter ıcın calısıyor
                System.out.println(arr[i - 1] + " sayi " + (counter + 1));

                counter = 0;//tekrardan basla
                //break;
            }
            if (i == arr.length - 1) {//en son karekter ıcın calsıır(BENZERSİZ İSE CALSIR)
                System.out.println(arr[i]+ " sayisi " + (counter+1));


            }
        }
    }}