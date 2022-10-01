package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

        String str = "Java bilen sırtı yere gelmez : )";
        System.out.println(str.substring(10));//10 karekterden sonra
        //str datasının son 10 karekterını print ediniz....
        System.out.println(str.substring(str.length() - 10));//gelmez : )parcalamak istedigin degerin son 10 ndan ıtıbaren parcalar
        //str datasının ilk 10 karekterını prınt edınız
        System.out.println(str.substring(0, 10));//İlk on karekter0,1,2,3 ..... 9
        //str ilk karekter nasıl bulunur
        System.out.println(str.charAt(0));//charAT ile
        System.out.println(str.substring(0, 1));//Substring metodu ile

        //TASK-> girilen dört harflı kelımeyı tersten print eden create ediniz?
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen terstten yazdırmak ıstedıgınız dört harfli kelımeyı giriniz --> ");
        String kelime = scan.nextLine();
        if (kelime.length()!=4){
            System.out.println("Lütfen 4 harfli bir kelime giriniz");
        }else{
            System.out.println(kelime.substring(kelime.length()-1));
            System.out.println(kelime.substring(2,3));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));





        }



    }
}
